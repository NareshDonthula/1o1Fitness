package com.fitness.FitnessApp.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fitness.FitnessApp.modal.MealPlanModal;

public interface MealPlanRepository extends MongoRepository<MealPlanModal, String> {


}
