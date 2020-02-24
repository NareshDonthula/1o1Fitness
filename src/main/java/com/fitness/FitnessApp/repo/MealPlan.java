package com.fitness.FitnessApp.repo;

import java.util.List;

import com.fitness.FitnessApp.modal.DayMealModal;
import com.fitness.FitnessApp.modal.GetModal;
import com.fitness.FitnessApp.modal.MealPlanModal;
import com.fitness.FitnessApp.modal.TraineeProfileModal;

public interface MealPlan {
	MealPlanModal  addNewFile(MealPlanModal mealplan);
	MealPlanModal getMealPlanData(MealPlanModal inputModal);
	MealPlanModal updateMealPlan(MealPlanModal inputModal);
	List<MealPlanModal> getDayFromMealPlan(GetModal modal);
	List<MealPlanModal> getDayMeal(MealPlanModal mealplan);
	MealPlanModal updateDay(MealPlanModal day);
	TraineeProfileModal getTraineeProfile(String traineeId);
    List<TraineeProfileModal> getAllTraineeProfiles(String programId);
}
