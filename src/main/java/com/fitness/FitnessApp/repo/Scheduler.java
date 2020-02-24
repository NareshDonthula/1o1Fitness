package com.fitness.FitnessApp.repo;

import java.util.List;

import com.fitness.FitnessApp.modal.DayModal;
import com.fitness.FitnessApp.modal.SchedulerModal;

public interface Scheduler {
	 SchedulerModal  addNewFile(SchedulerModal scheduler);
	 SchedulerModal getSchedulerData(SchedulerModal inputModal);
	 SchedulerModal updateScheduler(SchedulerModal inputModal);
	 List<SchedulerModal> getDayFromScheduler(String date);
	 Object getDayFromSchedulerById(String Id);
	 Object updateDay(DayModal day);
}
