package com.fitness.FitnessApp.repo;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.fitness.FitnessApp.modal.MastersModal;


public interface MastersRepository  extends MongoRepository<MastersModal, String> {

}
