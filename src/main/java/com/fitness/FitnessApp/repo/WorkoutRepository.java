package com.fitness.FitnessApp.repo;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.fitness.FitnessApp.modal.WorkoutModal;

public interface WorkoutRepository extends MongoRepository<WorkoutModal, String> {

	Object deleteByWorkoutId(String workoutId);

}
