package com.fitness.FitnessApp.repo;

import java.util.List;


import com.fitness.FitnessApp.modal.MastersModal;

public interface Masters {
	List<MastersModal> getAllMastersByType(String type);
}
