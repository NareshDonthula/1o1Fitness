package com.fitness.FitnessApp.repo;

import java.util.List;



import com.fitness.FitnessApp.modal.ProfileModal;

public interface Profile {
	List<ProfileModal> getAllExercize();
	ProfileModal addNewFile(ProfileModal file);
	ProfileModal getByUserId(String userId);
	ProfileModal getByUserName(String userId);
	ProfileModal deleteSingle(String name);
	ProfileModal UpdateProfile(String name, ProfileModal data);
	List<ProfileModal> getLimitedFields();
	List<ProfileModal> getAllTrainers(String Ids);
	List<ProfileModal> getTrainersByLocation(String state);
}
