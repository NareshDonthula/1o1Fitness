package com.fitness.FitnessApp.repo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.fitness.FitnessApp.modal.MappingModal;

@Repository
public class MappingImpl implements Mapping{
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public MappingModal addNewFile(MappingModal mapping) {
		mongoTemplate.save(mapping);
		// Now, user object will contain the ID as well
		return mapping;
	}
	@Override
	public MappingModal getRecord(Query query) {

		return mongoTemplate.findOne(query, MappingModal.class);
	}
	@Override
	public MappingModal getMappingByUserId(String userId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(userId));
		return (MappingModal) mongoTemplate.find(query,MappingModal.class);
	}

	@Override
	public MappingModal UpdateExerciseMapping(Query query, MappingModal data) {

		Update update = new Update();

		if(data.getAssignedWorkouts() != null && !data.getAssignedWorkouts().isEmpty())
			update.set("assignedWorkouts", data.getAssignedWorkouts());

		if(data.getType() != null && !data.getType().isEmpty())
			update.set("type", data.getType());
		
		return mongoTemplate.findAndModify(query,  update, MappingModal.class);
		
	}
	@Override
	public MappingModal UpdateWorkoutMapping(Query query, MappingModal data) {

		Update update = new Update();

		if(data.getAssignedPrograms() != null && !data.getAssignedPrograms().isEmpty())
			update.set("assignedPrograms", data.getAssignedPrograms());

		if(data.getType() != null && !data.getType().isEmpty())
			update.set("type", data.getType());
		
		return mongoTemplate.findAndModify(query,  update, MappingModal.class);

	}
}
