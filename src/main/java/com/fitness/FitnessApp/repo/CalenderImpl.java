package com.fitness.FitnessApp.repo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.fitness.FitnessApp.modal.CalenderModal;

@Repository
public class CalenderImpl implements Calender{
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public CalenderModal addNewFile(CalenderModal calender) {
		mongoTemplate.save(calender);
		// Now, user object will contain the ID as well
		return calender;
	}

	@Override
	public CalenderModal getDataByProgramId (String programId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("programId").is(programId));
		return mongoTemplate.findOne(query, CalenderModal.class);
	}

	@Override
	public CalenderModal UpdateCalenderData(String calenderId, CalenderModal data) {
		Query query = new Query();
		query.addCriteria(Criteria.where("calenderId").is(calenderId));


		Update update = new Update();

		if(data.getDays() != null)
			update.set("days", data.getDays());
		
		if(data.getIdleFor() !=0)
			update.set("idleFor", data.getIdleFor());
	
//		if(data.getMobile_days() != null)
//			update.set("mobile_days",data.getMobile_days());
		
		if(data.getStartDate() != null)
			update.set("startDate",data.getStartDate());
		
		return mongoTemplate.findAndModify(query,  update, CalenderModal.class);
	}

	@Override
	public CalenderModal getCalenderByCalenderId(String calenderId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("calenderId").is(calenderId));
		return mongoTemplate.findOne(query, CalenderModal.class);
	}

}
