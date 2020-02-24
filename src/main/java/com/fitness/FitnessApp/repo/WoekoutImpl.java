package com.fitness.FitnessApp.repo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import com.fitness.FitnessApp.modal.WorkoutModal;


@Repository
public class WoekoutImpl implements Workout{


	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<WorkoutModal> getAllWorkoutsById(String userId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(userId));
		return (List<WorkoutModal>) mongoTemplate.find(query,WorkoutModal.class);
	}
	@Override
	public WorkoutModal addNewWorkout(WorkoutModal workout) {
		mongoTemplate.save(workout);
		// Now, user object will contain the ID as well
		return workout;
	}
	@Override
	public WorkoutModal getWorkoutByWorkoutId(String workout) {
		Query query = new Query();
		query.addCriteria(Criteria.where("workoutId").is(workout));
		return mongoTemplate.findOne(query, WorkoutModal.class);
	}
	@Override
	public WorkoutModal UpdateWorkout(String workoutId, WorkoutModal data) {
		Query query = new Query();
		query.addCriteria(Criteria.where("workoutId").is(workoutId));

		Update update = new Update();

		if(data.getWorkoutName() != null)
			update.set("workoutName", data.getWorkoutName());

		if(data.getCustomWorkoutName() != null && !data.getCustomWorkoutName().isEmpty())
			update.set("customWorkoutName", data.getCustomWorkoutName());

		if(data.getWorkoutExercises() != null)
			update.set("workoutExercises", data.getWorkoutExercises());

		return mongoTemplate.findAndModify(query,  update, WorkoutModal.class);
	}
}


