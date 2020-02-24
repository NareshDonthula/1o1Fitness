package com.fitness.FitnessApp.controller;

import java.util.List;

import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.fitness.FitnessApp.modal.NutriGetModal;
import com.fitness.FitnessApp.modal.NutritionModal;
import com.fitness.FitnessApp.modal.TestModal;
import com.fitness.FitnessApp.repo.Nutrition;
import com.fitness.FitnessApp.repo.NutritionRepository;
import com.google.gson.Gson;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/nutrition")
@Api(value = "fitness", description = "CRUD operations on nutrition")
@CrossOrigin("*")
public class NutritionController {
	
	private final Nutrition nutrition;

	public NutritionController(Nutrition nutrition) {
		this.nutrition = nutrition;
	}
	
	// Get nutrient by name
	@RequestMapping(value = "/{foodName}", method = RequestMethod.GET)
	public List<NutriGetModal> getNutrient(@PathVariable String foodName) {
		return nutrition.getNutrients(foodName);
	}

	// Get nutrient by id
	@RequestMapping(value = "/nutrient/{id}", method = RequestMethod.GET)
	public NutritionModal getNutrientbyId(@PathVariable int id) {
		return nutrition.getNutritiondatabyID(id);
	}
}
