package com.fitness.FitnessApp.modal;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "MyPrograms")
public class MyProgramModal {
	@Id
	private String fileId;
	private String programName;
	private Integer plans;
	private Integer weeks;	
	private String programDuration;
	private float price;
	private Object[] currency;
	private Date date;
	private String description;
	private String userId;
	private String programId;
	private String programImg;
	private String imgPath;
	private String status;
	private String adminStatus;
	private Date startDate;
	private Object[] packageType;
	private Date enrollmentDate;
	private Object[] nutrition;
	
	public Object[] getNutrition() {
		return nutrition;
	}
	public void setNutrition(Object[] nutrition) {
		this.nutrition = nutrition;
	}
	public Object[] getPackageType() {
		return packageType;
	}
	public void setPackageType(Object[] packageType) {
		this.packageType = packageType;
	}
	public Date getEnrollmentDate() {
		return enrollmentDate;
	}
	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getAdminStatus() {
		return adminStatus;
	}
	public void setAdminStatus(String adminStatus) {
		this.adminStatus = adminStatus;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public Integer getPlans() {
		return plans;
	}
	public void setPlans(Integer plans) {
		this.plans = plans;
	}
	public Integer getWeeks() {
		return weeks;
	}
	public void setWeeks(Integer weeks) {
		this.weeks = weeks;
	}
	public String getProgramDuration() {
		return programDuration;
	}
	public void setProgramDuration(String programDuration) {
		this.programDuration = programDuration;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getProgramImg() {
		return programImg;
	}
	public void setProgramImg(String programImg) {
		this.programImg = programImg;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	
	public String getProgramId() {
		return programId;
	}
	public void setProgramId(String programId) {
		this.programId = programId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Object[] getCurrency() {
		return currency;
	}
	public void setCurrency(Object[] currency) {
		this.currency = currency;
	}
}
	
