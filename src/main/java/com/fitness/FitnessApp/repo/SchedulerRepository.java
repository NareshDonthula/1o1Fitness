package com.fitness.FitnessApp.repo;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.fitness.FitnessApp.modal.SchedulerModal;

public interface SchedulerRepository extends MongoRepository<SchedulerModal, String>  {
	
}
