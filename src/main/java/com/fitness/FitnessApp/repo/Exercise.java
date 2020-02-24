package com.fitness.FitnessApp.repo;

import java.util.List;

import org.springframework.data.mongodb.core.query.Query;

import com.fitness.FitnessApp.modal.ExerciseModal;
import com.mongodb.client.result.DeleteResult;

public interface Exercise {

	List<ExerciseModal> getAllExerciseById(String userId);
	ExerciseModal addNewFile(ExerciseModal exercise);
	ExerciseModal getExerciseByExerciseId(String exercieId);
	ExerciseModal UpdateExercise(String exerciseId, ExerciseModal data);
	public Object deleteObject(String id);
}
