package com.fitness.FitnessApp.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.fitness.FitnessApp.modal.DayModal;
import com.fitness.FitnessApp.modal.SchedulerModal;

@Repository
public class SchedulerImpl implements Scheduler {
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public SchedulerModal addNewFile(SchedulerModal scheduler) {
		mongoTemplate.save(scheduler);
		// Now, user object will contain the ID as well
		return scheduler;
	}

	@Override
	public SchedulerModal getSchedulerData(SchedulerModal inputModal) {
		Query query = new Query();
		query.addCriteria(Criteria.where("trainerId").is(inputModal.getTrainerId()));
		query.addCriteria(Criteria.where("month").is(inputModal.getMonth()));
		return mongoTemplate.findOne(query, SchedulerModal.class);
	}

	@Override
	public SchedulerModal updateScheduler(SchedulerModal inputModal) {
		Query query = new Query();
		query.addCriteria(Criteria.where("trainerId").is(inputModal.getTrainerId()));
		query.addCriteria(Criteria.where("month").is(inputModal.getMonth()));


		Update update = new Update();

		if(inputModal.getDays() != null && inputModal.getDays().length != 0)
			update.set("days", inputModal.getDays());
		
		return mongoTemplate.findAndModify(query,  update, SchedulerModal.class);
	}

	@Override
	public Object getDayFromSchedulerById(String id) {
		Query query = new Query();
		String[] arr = id.split(",");
		query.addCriteria(Criteria.where("trainerId").is(arr[1]));
        query.addCriteria(Criteria.where("days.id").is(Integer.parseInt(arr[0])));
        query.fields().include("days.$");
        return mongoTemplate.find(query, SchedulerModal.class);
	}
	@Override
	public List<SchedulerModal> getDayFromScheduler(String date) {
		Query query = new Query();
		String[] arr = date.split(",");
		query.addCriteria(Criteria.where("trainerId").is(arr[1]));
        query.addCriteria(Criteria.where("days.date").is(arr[0]));
        query.fields().include("days.$");
        return mongoTemplate.find(query, SchedulerModal.class);
	}
	

	@Override
	public Object updateDay(DayModal day) {
		//String date;
		Query query = new Query();
		Update update = new Update();
		query.addCriteria(Criteria.where("trainerId").is(day.getTrainerId()));
		query.addCriteria(Criteria.where("days.id").is(day.getId()));
		update.set("days.$.slots", day.getSlots());
        return mongoTemplate.findAndModify(query,  update, SchedulerModal.class);
	}

}
