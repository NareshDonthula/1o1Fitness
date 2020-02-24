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
import com.fitness.FitnessApp.modal.GetModal;
import com.fitness.FitnessApp.modal.MealPlanModal;
import com.fitness.FitnessApp.modal.TraineeProfileModal;
import com.fitness.FitnessApp.repo.MealPlan;
import com.fitness.FitnessApp.repo.MealPlanRepository;
import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/mealplan")
@Api(value = "fitness", description = "CRUD operations on mealplan")
@CrossOrigin("*")
public class MealPlanController extends Throwable {
	private static final long serialVersionUID = 1L;
	private final Logger LOG = LoggerFactory.getLogger(getClass());

	private final MealPlanRepository mealPlanRepository;
	private final MealPlan mealPlan;

	public MealPlanController(MealPlanRepository mealPlanRepository, MealPlan mealPlan) {
		this.mealPlanRepository = mealPlanRepository;
		this.mealPlan = mealPlan;
	}
    
	// Create a meal plan (or) Update a meal plan
	@RequestMapping(value = "", method = RequestMethod.POST)
	public MealPlanModal addMealPlan(@RequestBody MealPlanModal inputMealPlan) {
		MealPlanModal result = mealPlan.getMealPlanData(inputMealPlan);
		if (result != null) {
			return mealPlan.updateMealPlan(inputMealPlan);
		}
		return mealPlanRepository.save(inputMealPlan);
	}

	// Get monthly meal plan created by a trainer by trainer id and trainee id and month
	@RequestMapping(value = "", method = RequestMethod.GET)
	public MealPlanModal getMealPlan(@RequestBody MealPlanModal input) {
		return mealPlan.getMealPlanData(input);
	}
	
    // Get daily meal plan
	@RequestMapping(value = "/day", method = RequestMethod.GET)
	public List<MealPlanModal> getDayFromMealPlan(@RequestBody GetModal modal) {
		return mealPlan.getDayFromMealPlan(modal);
	}

	// Get all trainees of a program by program Id
	@RequestMapping(value = "/trainees/{program_id}", method = RequestMethod.GET)
	public List<TraineeProfileModal> getAllTrainees(@PathVariable String program_id) {
		return mealPlan.getAllTraineeProfiles(program_id);
	}
    
	// Get trainee
	@RequestMapping(value = "/{trainee_id}", method = RequestMethod.GET)
	public TraineeProfileModal getTrainee(@PathVariable String trainee_id) {
		return mealPlan.getTraineeProfile(trainee_id);
	}

	@ExceptionHandler({ SchedulerController.class })
	public void handleException() {
		System.out.println(getMessage());
	}
}
