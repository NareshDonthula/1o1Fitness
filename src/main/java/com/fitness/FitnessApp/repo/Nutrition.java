package com.fitness.FitnessApp.repo;

import java.util.List;

import com.fitness.FitnessApp.modal.DemoNutrition;
import com.fitness.FitnessApp.modal.NutriGetModal;
import com.fitness.FitnessApp.modal.NutritionModal;

public interface Nutrition {
	List<DemoNutrition> getNutritionDataByDescription(String foodName);
	List<NutriGetModal> getNutrients(String foodName);
	List<NutriGetModal> getAll();
	NutritionModal getNutritiondatabyID(int id);
}
