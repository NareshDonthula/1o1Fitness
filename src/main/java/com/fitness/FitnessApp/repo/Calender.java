package com.fitness.FitnessApp.repo;

import com.fitness.FitnessApp.modal.CalenderModal;

public interface Calender {
	CalenderModal addNewFile(CalenderModal calender);
	CalenderModal getDataByProgramId(String programId);
	CalenderModal getCalenderByCalenderId(String calenderId);
	CalenderModal UpdateCalenderData(String calenderId, CalenderModal data);
}
