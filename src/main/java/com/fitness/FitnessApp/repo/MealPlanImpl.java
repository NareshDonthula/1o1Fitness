package com.fitness.FitnessApp.repo;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.fitness.FitnessApp.modal.DayMealModal;
import com.fitness.FitnessApp.modal.GetModal;
import com.fitness.FitnessApp.modal.MealPlanModal;
import com.fitness.FitnessApp.modal.SchedulerModal;
import com.fitness.FitnessApp.modal.TraineeProfileModal;


@Repository
public class MealPlanImpl implements MealPlan{

	@Autowired
	private MongoTemplate mongoTemplate; 
	
	@Override
	public MealPlanModal addNewFile(MealPlanModal mealplan) {
	return	mongoTemplate.save(mealplan);

	}

	@Override
	public MealPlanModal getMealPlanData(MealPlanModal inputModal) {
		Query query = new Query();
		query.addCriteria(Criteria.where("trainerId").is(inputModal.getTrainerId()));
		query.addCriteria(Criteria.where("traineeId").is(inputModal.getTraineeId()));
		query.addCriteria(Criteria.where("month").is(inputModal.getMonth()));
		return mongoTemplate.findOne(query, MealPlanModal.class);
	}

	@Override
	public MealPlanModal updateMealPlan(MealPlanModal inputModal) {
		Query query = new Query();
		Object c;
		query.addCriteria(Criteria.where("trainerId").is(inputModal.getTrainerId()));
		query.addCriteria(Criteria.where("traineeId").is(inputModal.getTraineeId()));
		query.addCriteria(Criteria.where("month").is(inputModal.getMonth()));
		
		MealPlanModal mealResult = mongoTemplate.findOne(query, MealPlanModal.class);
		
		query.addCriteria(Criteria.where("days.date").is(inputModal.getDays()[0].getDate()));
	    query.fields().include("days.$");
	    
	    List<MealPlanModal> result = mongoTemplate.find(query, MealPlanModal.class);
	    if(result.size() != 0) {
	    	return updateDay(inputModal);
	    }else {
	    	DayMealModal[]  a = mealResult.getDays();
	    	DayMealModal[] b = inputModal.getDays();
	    	c = Stream.of(a,b) 
            .flatMap(Stream::of) 
            .toArray();
	    }
	    Query query1 = new Query();
		query1.addCriteria(Criteria.where("trainerId").is(inputModal.getTrainerId()));
		query1.addCriteria(Criteria.where("traineeId").is(inputModal.getTraineeId()));
		query1.addCriteria(Criteria.where("month").is(inputModal.getMonth()));
		
		Update update = new Update();
		update.set("days", c);
		
		return mongoTemplate.findAndModify(query1,  update, MealPlanModal.class);
	}

	@Override
	public List<MealPlanModal> getDayFromMealPlan(GetModal modal) {
		    Query query = new Query();
			query.addCriteria(Criteria.where("trainerId").is(modal.getTrainerId()));
			query.addCriteria(Criteria.where("traineeId").is(modal.getTraineeId()));
			query.addCriteria(Criteria.where("month").is(modal.getMonth()));
	        query.addCriteria(Criteria.where("days.date").is(modal.getDate()));
	        query.fields().include("days.$");
        return mongoTemplate.find(query, MealPlanModal.class);
	}

	@Override
	public MealPlanModal updateDay(MealPlanModal day) {
		 Query query = new Query();
		 Update update = new Update();
		 query.addCriteria(Criteria.where("trainerId").is(day.getTrainerId()));
		 query.addCriteria(Criteria.where("traineeId").is(day.getTraineeId()));
		 query.addCriteria(Criteria.where("month").is(day.getMonth()));
		 query.addCriteria(Criteria.where("days.date").is(day.getDays()[0].getDate()));
		 update.set("days.$.breakfast", day.getDays()[0].getBreakfast());
		 update.set("days.$.lunch", day.getDays()[0].getLunch());
		 update.set("days.$.snacks_1", day.getDays()[0].getsnacks_1());
		 update.set("days.$.dinner", day.getDays()[0].getDinner());
		 update.set("days.$.snacks_2", day.getDays()[0].getsnacks_2());
        return mongoTemplate.findAndModify(query,  update, MealPlanModal.class);
	}

	@Override
	public List<MealPlanModal> getDayMeal(MealPlanModal mealplan) {
		    Query query = new Query();
			query.addCriteria(Criteria.where("trainerId").is(mealplan.getTrainerId()));
			query.addCriteria(Criteria.where("traineeId").is(mealplan.getTraineeId()));
			query.addCriteria(Criteria.where("month").is(mealplan.getMonth()));
	        query.addCriteria(Criteria.where("days.date").is(mealplan.getDays()[0].getDate()));
	        query.fields().include("days.$");
            return mongoTemplate.find(query, MealPlanModal.class);
	}

	@Override
	public TraineeProfileModal getTraineeProfile(String traineeId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("traineeId").is(traineeId));
		return mongoTemplate.findOne(query, TraineeProfileModal.class);
	}

	@Override
	public List<TraineeProfileModal> getAllTraineeProfiles(String programId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("programId").is(programId));
		return mongoTemplate.find(query, TraineeProfileModal.class);
	}

}
