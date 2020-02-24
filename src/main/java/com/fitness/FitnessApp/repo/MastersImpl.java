package com.fitness.FitnessApp.repo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.fitness.FitnessApp.modal.MastersModal;

@Repository
public class MastersImpl implements Masters{
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public List<MastersModal> getAllMastersByType(String type) {
		Query query = new Query();
		query.addCriteria(Criteria.where("type").is(type));
		return (List<MastersModal>) mongoTemplate.find(query,MastersModal.class);
	}
}
