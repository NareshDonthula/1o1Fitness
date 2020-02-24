package com.fitness.FitnessApp.modal;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "MealPlan")
public class MealPlanModal {
	@Id
	private String fileId;
	private String trainerId;
	private Date createdDate;
	private String traineeId;
	private String month;	
	private DayMealModal[] days;
	
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
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(String traineeId) {
		this.traineeId = traineeId;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public DayMealModal[] getDays() {
		return days;
	}
	public void setDays(DayMealModal[] days) {
		this.days = days;
	}
	

}
