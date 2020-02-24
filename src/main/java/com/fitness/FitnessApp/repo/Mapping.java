package com.fitness.FitnessApp.repo;

import org.springframework.data.mongodb.core.query.Query;


import com.fitness.FitnessApp.modal.MappingModal;

public interface Mapping {
	MappingModal addNewFile(MappingModal mapping);
	MappingModal getRecord(Query query);
	MappingModal getMappingByUserId(String userId);
	MappingModal UpdateExerciseMapping(Query query, MappingModal data);
	MappingModal UpdateWorkoutMapping(Query query, MappingModal data);
}
