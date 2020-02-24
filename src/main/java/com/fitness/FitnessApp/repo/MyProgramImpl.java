package com.fitness.FitnessApp.repo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.fitness.FitnessApp.modal.MyProgramModal;

@Repository
public class MyProgramImpl implements MyProgram {
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<MyProgramModal> getAllProgramsById(String userId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(userId));
		return (List<MyProgramModal>) mongoTemplate.find(query,MyProgramModal.class);
	}

	@Override
	public MyProgramModal addNewProgram(MyProgramModal program) {
		mongoTemplate.save(program);
		// Now, user object will contain the ID as well
		return program;
	}
	@Override
	public MyProgramModal getProgramByProgramId(String programId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("programId").is(programId));
		return mongoTemplate.findOne(query, MyProgramModal.class);
	}

	@Override
	public MyProgramModal UpdateMyprogram(String programId, MyProgramModal data) {
		Query query = new Query();
		query.addCriteria(Criteria.where("programId").is(programId));

		Update update = new Update();

		if(data.getStatus() != null)
			update.set("status", data.getStatus());

		if(data.getProgramName() != null && !data.getProgramName().isEmpty())
			update.set("programName", data.getProgramName());

		if(data.getPlans() != null)
			update.set("plans", data.getPlans());

		if(data.getWeeks() != null)
			update.set("weeks", data.getWeeks());

		if(data.getProgramDuration() != null && !data.getProgramDuration().isEmpty())
			update.set("programDuration", data.getProgramDuration());

		update.set("price", data.getPrice());

		if(data.getNutrition() != null)
			update.set("nutrition", data.getNutrition());
		
		if(data.getEnrollmentDate() != null)
			update.set("enrollmentDate", data.getEnrollmentDate());

		if(data.getPackageType() != null)
			update.set("packageType", data.getPackageType());

		if(data.getProgramImg() != null && !data.getProgramImg().isEmpty())
			update.set("programImg", data.getProgramImg());

		if(data.getImgPath() != null && !data.getImgPath().isEmpty())
			update.set("imgPath", data.getImgPath());

		if(data.getDescription() != null && !data.getDescription().isEmpty())
			update.set("description", data.getDescription());
		
		if(data.getCurrency() != null && data.getCurrency().length !=0)
			update.set("currency", data.getCurrency());
		return mongoTemplate.findAndModify(query,  update, MyProgramModal.class);

	}

}
