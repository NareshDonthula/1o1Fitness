package com.fitness.FitnessApp.repo;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.core.query.TextQuery;
import org.springframework.stereotype.Repository;
import com.fitness.FitnessApp.modal.DemoNutrition;
import com.fitness.FitnessApp.modal.NutriGetModal;
import com.fitness.FitnessApp.modal.NutritionModal;


@Repository
public class NutritionImpl implements Nutrition{

	@Autowired
	private MongoTemplate mongoTemplate;
	
	/*
	 * @Override public List<NutritionModal> getNutritionDataByDescription(String
	 * description) {
	 * 
	 * TextCriteria criteria =
	 * TextCriteria.forDefaultLanguage().matchingPhrase(description);
	 * 
	 * Query query = TextQuery.queryText(criteria).sortByScore(); return
	 * (List<NutritionModal>) mongoTemplate.find(query,NutritionModal.class); }
	 * 
	 * @Override public NutritionModal getNutrients(int fdcId) { Query query = new
	 * Query(); query.addCriteria(Criteria.where("fdcId").is(fdcId));
	 * query.fields().include("labelNutrients"); return mongoTemplate.findOne(query,
	 * NutritionModal.class);
	 * 
	 * }
	 */
	
	@Override
	public List<DemoNutrition> getNutritionDataByDescription(String foodName) {
	
		TextCriteria criteria = TextCriteria.forDefaultLanguage().matchingPhrase(foodName);

		Query query = TextQuery.queryText(criteria).sortByScore();
		return (List<DemoNutrition>) mongoTemplate.find(query,DemoNutrition.class);
	}

	@Override
	public List<NutriGetModal> getNutrients(String foodName) {
		Query query = new Query();
		
		query.addCriteria(Criteria.where("foodName").regex("^"+foodName, "i")).with(Sort.by(Sort.Direction.ASC, "foodId"));
		return mongoTemplate.find(query,NutriGetModal.class);
		
		/*
		 * query.addCriteria(Criteria.where("foodName").is(foodName));
		 * query.fields().include("protein"); query.fields().include("carbohydrate");
		 * query.fields().include("totalFibre"); query.fields().include("totalFat");
		 * query.fields().include("Calcium"); return mongoTemplate.findOne(query,
		 * DemoNutrition.class);
		 */
	}public List<NutriGetModal> getAll() {
		Query query = new Query();
		query.fields().include("id");
		query.fields().include("foodName");
		return mongoTemplate.find(query, NutriGetModal.class);
	}
	@Override
	public NutritionModal getNutritiondatabyID(int id) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("foodId").is(id));
		return mongoTemplate.findOne(query, NutritionModal.class);
	}

}
