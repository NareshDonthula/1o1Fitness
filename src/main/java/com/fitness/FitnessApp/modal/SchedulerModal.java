package com.fitness.FitnessApp.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CallScheduler")
public class SchedulerModal {
	@Id
	private String fileId;
	private String trainerId;
	private String month;
	private String timezone;
	private Object[] days;
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public Object[] getDays() {
		return days;
	}
	public void setDays(Object[] days) {
		this.days = days;
	}

}
