package com.fitness.FitnessApp.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "TraineeProfile")
public class TraineeProfileModal {
	@Id
	private String fileId;
	private String traineeId;
	private String name;
	private String gender;
	private int age;
	private String height;
	private String weight;
	private String diet;
	private String totalBmrValue;
	private String totalBmiValue;
	private String traineeImg;
	
	public String getTraineeImg() {
		return traineeImg;
	}
	public void setTraineeImg(String traineeImg) {
		this.traineeImg = traineeImg;
	}
	public String getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(String traineeId) {
		this.traineeId = traineeId;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
	}
	public String getTotalBmrValue() {
		return totalBmrValue;
	}
	public void setTotalBmrValue(String totalBmrValue) {
		this.totalBmrValue = totalBmrValue;
	}
	public String getTotalBmiValue() {
		return totalBmiValue;
	}
	public void setTotalBmiValue(String totalBmiValue) {
		this.totalBmiValue = totalBmiValue;
	}
	
	
}
