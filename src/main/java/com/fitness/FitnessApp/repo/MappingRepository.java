package com.fitness.FitnessApp.repo;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.fitness.FitnessApp.modal.MappingModal;

public interface MappingRepository extends MongoRepository<MappingModal, String>  {

}
