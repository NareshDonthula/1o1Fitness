package com.fitness.FitnessApp.modal;

public class GetModal {
	private String trainerId;
	private DayMealModal data;
	
	public DayMealModal getData() {
		return data;
	}
	public void setData(DayMealModal data) {
		this.data = data;
	}
	public String getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	private String traineeId;
	private String month;
	private String date;

}
