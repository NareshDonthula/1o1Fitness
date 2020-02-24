package com.fitness.FitnessApp.modal;

import java.util.Date;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Calender")
public class CalenderModal {
	@Id
	private String fileId;
	private String programId;
	private String userId;
	private String calenderId;
	private Date startDate;
	//private Object[] mobile_days;
	private Object[] days;
	private int idleFor;
	
	public int getIdleFor() {
		return idleFor;
	}
	public void setIdleFor(int idleFor) {
		this.idleFor = idleFor;
	}
	public Object[] getDays() {
		return days;
	}
	public void setDays(Object[] days) {
		this.days = days;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	/*
	 * public Object[] getMobile_days() { return mobile_days; } public void
	 * setMobile_days(Object[] mobile_days) { this.mobile_days = mobile_days; }
	 */
	
	
	public String getCalenderId() {
		return calenderId;
	}
	public void setCalenderId(String calenderId) {
		this.calenderId = calenderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getProgramId() {
		return programId;
	}
	public void setProgramId(String programId) {
		this.programId = programId;
	}
	
}
