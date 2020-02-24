package com.fitness.FitnessApp.modal;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "TrainerProfile")
public class ProfileModal {

	@Id
	private String fileId;
	private String gender;
	private String category;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String country;
	private String pincode;
	private String websiteUrl;
	private String facebookId;
	private String twitterId;
	private String instagramId;
	private String trainingSince;
	private String servicesOffered;
	private String about;
	private String certification;
	private String achievements;
	private String imgName;
	private String imgPath;
	private String mp4Destination;
	private String thumbnailDestination;
	private String certificateUrl;
	private String uploadedCertificate;
	private String videoName;
	private String sourceUrl;
	private String userName;
	private String userId;
    private String destVideoCheck;
    private String profileStatus;
    private String registraionType;
    private String isNutritionist;
    private String adminStatus;
    
	public String getAdminStatus() {
		return adminStatus;
	}

	public void setAdminStatus(String adminStatus) {
		this.adminStatus = adminStatus;
	}

	public String getIsNutritionist() {
		return isNutritionist;
	}

	public void setIsNutritionist(String isNutritionist) {
		this.isNutritionist = isNutritionist;
	}

	public String getRegistraionType() {
		return registraionType;
	}

	public void setRegistraionType(String registraionType) {
		this.registraionType = registraionType;
	}

	public String getProfileStatus() {
		return profileStatus;
	}

	public void setProfileStatus(String profileStatus) {
		this.profileStatus = profileStatus;
	}
	private Date creationDate = new Date();

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getWebsiteUrl() {
		return websiteUrl;
	}
	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
	public String getFacebookId() {
		return facebookId;
	}
	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}
	public String getTwitterId() {
		return twitterId;
	}
	public void setTwitterId(String twitterId) {
		this.twitterId = twitterId;
	}
	public String getInstagramId() {
		return instagramId;
	}
	public void setInstagramId(String instagramId) {
		this.instagramId = instagramId;
	}
	public String getTrainingSince() {
		return trainingSince;
	}
	public void setTrainingSince(String trainingSince) {
		this.trainingSince = trainingSince;
	}
	public String getServicesOffered() {
		return servicesOffered;
	}
	public void setServicesOffered(String servicesOffered) {
		this.servicesOffered = servicesOffered;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	public String getAchievements() {
		return achievements;
	}

	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public String getMp4Destination() {
		return mp4Destination;
	}
	public void setMp4Destination(String mp4Destination) {
		this.mp4Destination = mp4Destination;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
	public String getThumbnailDestination() {
		return thumbnailDestination;
	}

	public void setThumbnailDestination(String thumbnailDestination) {
		this.thumbnailDestination = thumbnailDestination;
	}
	
	public String getDestVideoCheck() {
		return destVideoCheck;
	}

	public void setDestVideoCheck(String destVideoCheck) {
		this.destVideoCheck = destVideoCheck;
	}
	public String getCertificateUrl() {
		return certificateUrl;
	}

	public void setCertificateUrl(String certificateUrl) {
		this.certificateUrl = certificateUrl;
	}

	public String getUploadedCertificate() {
		return uploadedCertificate;
	}

	public void setUploadedCertificate(String uploadedCertificate) {
		this.uploadedCertificate = uploadedCertificate;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}



}

