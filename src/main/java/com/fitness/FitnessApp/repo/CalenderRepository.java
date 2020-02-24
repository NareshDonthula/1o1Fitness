package com.fitness.FitnessApp.repo;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.fitness.FitnessApp.modal.CalenderModal;

public interface CalenderRepository extends MongoRepository<CalenderModal, String>{

}
