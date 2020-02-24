package com.fitness.FitnessApp.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fitness.FitnessApp.modal.WorkoutModal;
import com.fitness.FitnessApp.repo.Workout;
import com.fitness.FitnessApp.repo.WorkoutRepository;
import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/workout")
@Api(value = "fitness", description = "CRUD operations on workout")
@CrossOrigin("*")
public class WorkoutController extends Throwable {

	private static final long serialVersionUID = 1L;
	private final Logger LOG = LoggerFactory.getLogger(getClass());

	private final WorkoutRepository workoutRepository;
	private final Workout workout;

	public WorkoutController(WorkoutRepository workoutRepository, Workout workout) {
		this.workoutRepository = workoutRepository;
		this.workout = workout;

	}

	// Create a workout (or) Update a workout
	@RequestMapping(value = "", method = RequestMethod.POST)
	public WorkoutModal addWorkout(@RequestBody WorkoutModal inputworkout) {

		String workoutId = inputworkout.getWorkoutId();
		WorkoutModal result = workout.getWorkoutByWorkoutId(workoutId);

		if (result != null) {
			return workout.UpdateWorkout(workoutId, inputworkout);
		}
		return workoutRepository.save(inputworkout);

	}

	// Get a workout by workout id
	@RequestMapping(value = "/{workout_id}", method = RequestMethod.GET)
	public WorkoutModal getWorkout(@PathVariable String workout_id) {
		LOG.info("Getting user with ID: {}.", workout_id);
		return workout.getWorkoutByWorkoutId(workout_id);
	}

	// Get all workouts created by a trainer by trainer id
	@RequestMapping(value = "/trainer/{trainer_id}", method = RequestMethod.GET)
	public List<WorkoutModal> getAllWorkoutById(@PathVariable String trainer_id) {
		LOG.info("Getting user with ID: {}.", trainer_id);
		return workout.getAllWorkoutsById(trainer_id);
	}

	/*
	 * @RequestMapping(value = "/delete/", method = RequestMethod.POST) public
	 * Object deleteExercise(@RequestBody String workoutId) { return
	 * workoutRepository.deleteByWorkoutId(workoutId); }
	 */

	@ExceptionHandler({ ExerciseController.class })
	public void handleException() {
		System.out.println(getMessage());
	}
}
