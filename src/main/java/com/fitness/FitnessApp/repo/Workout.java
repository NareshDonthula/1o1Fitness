package com.fitness.FitnessApp.repo;

import java.util.List;


import com.fitness.FitnessApp.modal.WorkoutModal;

public interface Workout {
	List<WorkoutModal> getAllWorkoutsById(String uesrId);
	WorkoutModal addNewWorkout(WorkoutModal workout);
	WorkoutModal getWorkoutByWorkoutId(String workoutId);
	WorkoutModal UpdateWorkout(String workoutId, WorkoutModal data);
}
