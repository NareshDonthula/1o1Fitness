package com.fitness.FitnessApp.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.fitness.FitnessApp.modal.ProfileModal;
import com.mongodb.BasicDBObject;
import com.mongodb.util.JSON;

@Repository
public class ProfileImpl implements Profile{

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<ProfileModal> getAllExercize() {
		return mongoTemplate.findAll(ProfileModal.class);
	}
	@Override
	public ProfileModal addNewFile(ProfileModal file) {
		mongoTemplate.save(file);
		// Now, user object will contain the ID as well
		return file;
	}
	@Override
	public ProfileModal getByUserId(String userId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(userId));
		return mongoTemplate.findOne(query, ProfileModal.class);
	}
	@Override
	public ProfileModal getByUserName(String userName) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userName").is(userName));
		return mongoTemplate.findOne(query, ProfileModal.class);
	}
	@Override
	public ProfileModal deleteSingle(String name) {
		Query query = new Query();
		query.addCriteria(Criteria.where("videoName").is(name));
		return (ProfileModal) mongoTemplate.findAllAndRemove(query, ProfileModal.class);
	}
	@Override
	public ProfileModal UpdateProfile(String userId, ProfileModal data) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(userId));

		Update update = new Update();

		if(data.getGender() != null && !data.getGender().isEmpty())
			update.set("gender", data.getGender());

		if(data.getVideoName() != null && !data.getVideoName().isEmpty())
			update.set("videoName", data.getVideoName());

		if(data.getCategory() != null && !data.getCategory().isEmpty())
			update.set("category", data.getCategory());

		if(data.getFirstName() != null && !data.getFirstName().isEmpty())
			update.set("firstName", data.getFirstName());

		if(data.getLastName() != null && !data.getLastName().isEmpty())
			update.set("lastName", data.getLastName());

		if(data.getAddress() != null && !data.getAddress().isEmpty())
			update.set("address", data.getAddress());

		if(data.getCity() != null && !data.getCity().isEmpty())
			update.set("city", data.getCity());

		if(data.getState() != null && !data.getState().isEmpty())
			update.set("state", data.getState());

		if(data.getCountry() != null && !data.getCountry().isEmpty())
			update.set("country", data.getCountry());

		if(data.getPincode() != null && !data.getPincode().isEmpty())
			update.set("pincode", data.getPincode());

		if(data.getWebsiteUrl() != null && !data.getWebsiteUrl().isEmpty())
			update.set("websiteUrl", data.getWebsiteUrl());

		if(data.getFacebookId() != null && !data.getFacebookId().isEmpty())
			update.set("facebookId", data.getFacebookId());

		if(data.getTwitterId() != null && !data.getTwitterId().isEmpty())
			update.set("twitterId", data.getTwitterId());

		if(data.getInstagramId() != null && !data.getInstagramId().isEmpty())
			update.set("instagramId", data.getInstagramId());

		if(data.getTrainingSince() != null && !data.getTrainingSince().isEmpty())
			update.set("trainingSince", data.getTrainingSince());

		if(data.getServicesOffered() != null && !data.getServicesOffered().isEmpty())
			update.set("servicesOffered", data.getServicesOffered());

		if(data.getAbout() != null && !data.getAbout().isEmpty())
			update.set("about", data.getAbout());

		if(data.getCertification() != null && !data.getCertification().isEmpty())
			update.set("certification", data.getCertification());
		if(data.getAchievements() != null && !data.getAchievements().isEmpty())
			update.set("achievements", data.getAchievements());

		if(data.getImgPath() != null && !data.getImgPath().isEmpty())
			update.set("imgPath", data.getImgPath());

		if(data.getMp4Destination() != null && !data.getMp4Destination().isEmpty())
			update.set("mp4Destination", data.getMp4Destination());

		if(data.getThumbnailDestination() != null && !data.getThumbnailDestination().isEmpty())
			update.set("thumbnailDestination", data.getThumbnailDestination());


		if(data.getSourceUrl() != null && !data.getSourceUrl().isEmpty())
			update.set("sourceUrl", data.getSourceUrl()); 

		if(data.getUserName() != null && !data.getUserName().isEmpty())
			update.set("userName", data.getUserName());

//		if(data.getUserId() != null && !data.getUserId().isEmpty())
//			update.set("userId", data.getUserId());
		
		if(data.getDestVideoCheck() != null && !data.getDestVideoCheck().isEmpty())
			update.set("destVideoCheck", data.getDestVideoCheck());
		
		if(data.getCertificateUrl() != null && !data.getCertificateUrl().isEmpty())
			update.set("certificateUrl", data.getCertificateUrl());

		if(data.getUploadedCertificate() != null && !data.getUploadedCertificate().isEmpty())
			update.set("uploadedCertificate", data.getUploadedCertificate());

		if(data.getImgName() != null && !data.getImgName().isEmpty())
			update.set("imgName", data.getImgName());
		
		if(data.getProfileStatus() != null && !data.getProfileStatus().isEmpty())
			update.set("profileStatus", data.getProfileStatus());
		
		if(data.getRegistraionType() != null && !data.getRegistraionType().isEmpty())
			update.set("registraionType", data.getRegistraionType());
		
		if(data.getIsNutritionist() != null && !data.getIsNutritionist().isEmpty())
			update.set("isNutritionist", data.getIsNutritionist());
		
		return mongoTemplate.findAndModify(query,  update, ProfileModal.class);
	}
	@Override
	public List<ProfileModal> getLimitedFields() {
		Query query = new Query();
		query.fields().include("userId");
		query.fields().include("imgPath");
		query.fields().include("firstName");
		query.fields().include("lastName");
		query.fields().include("mp4Destination");
		query.fields().include("thumbnailDestination");
		query.fields().include("city");
		return mongoTemplate.find(query, ProfileModal.class);
	}
	@Override
	public List<ProfileModal> getAllTrainers(String Ids) {
		String[] array = Ids.split(",");
		List<String> list = new ArrayList<String>(Arrays.asList(array));
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").in(list));
		return mongoTemplate.find(query, ProfileModal.class);
	}
	@Override
	public List<ProfileModal> getTrainersByLocation(String state) {
		Query query = new Query();
		query.addCriteria(Criteria.where("city").is(state));
		query.fields().include("userId");
		query.fields().include("imgPath");
		query.fields().include("firstName");
		query.fields().include("lastName");
		query.fields().include("mp4Destination");
		query.fields().include("thumbnailDestination");
		query.fields().include("city");
		return mongoTemplate.find(query, ProfileModal.class);
	}
}
