package com.fitness.FitnessApp.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Mapping")
public class MappingModal {
	@Id
	private String fileId;
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getExerciseId() {
		return exerciseId;
	}
	public void setExerciseId(String exerciseId) {
		this.exerciseId = exerciseId;
	}
	public String getWorkoutId() {
		return workoutId;
	}
	public void setWorkoutId(String workoutId) {
		this.workoutId = workoutId;
	}
	public String getAssignedPrograms() {
		return assignedPrograms;
	}
	public void setAssignedPrograms(String assignedPrograms) {
		this.assignedPrograms = assignedPrograms;
	}
	public String getAssignedWorkouts() {
		return assignedWorkouts;
	}
	public void setAssignedWorkouts(String assignedWorkouts) {
		this.assignedWorkouts = assignedWorkouts;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	private String type;
	private String userId;
	private String exerciseId;
	private String workoutId;
	private String assignedPrograms;
	private String assignedWorkouts;
}
