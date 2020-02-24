package com.fitness.FitnessApp.repo;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.fitness.FitnessApp.modal.MyProgramModal;

public interface MyProgramRepository extends MongoRepository<MyProgramModal, String> {

}
