package com.fitness.FitnessApp.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fitness.FitnessApp.modal.NutritionModal;

public interface NutritionRepository extends MongoRepository<NutritionModal, String> {

	//List<NutritionModal> findAllBy(TextCriteria criteria);
	
}
