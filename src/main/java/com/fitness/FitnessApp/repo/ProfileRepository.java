package com.fitness.FitnessApp.repo;

import org.springframework.data.mongodb.repository.MongoRepository;



import com.fitness.FitnessApp.modal.ProfileModal;

public interface ProfileRepository extends MongoRepository<ProfileModal, String> {
	ProfileModal findByUserId(String  String);
	ProfileModal deleteByUserId(String userId);
}
