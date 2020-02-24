package com.fitness.FitnessApp.repo;

import org.springframework.data.mongodb.repository.MongoRepository;



import com.fitness.FitnessApp.modal.ExerciseModal;


public interface ExerciseRepository extends MongoRepository<ExerciseModal, String> {
	ExerciseModal findByUserId(String  String);
	Object deleteByExerciseId(String  String);
}
