package com.fitness.FitnessApp.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "nutrition_search")
public class DemoNutrition {
	@Id
	private String fileId;
	private int id;
	private String foodName;
	private float protein;
	private int energy;
	private String imgUrl;
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	private float carbohydrate;
	private float totalFibre;
	private float totalFat;
	private float calcium;
	private String catagory1;
	private String catagory2;
	private int quantity;
	private String units;
	
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		id = id;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public float getProtein() {
		return protein;
	}
	public void setProtein(float protein) {
		this.protein = protein;
	}
	public float getCarbohydrate() {
		return carbohydrate;
	}
	public void setCarbohydrate(float carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
	public float getTotalFibre() {
		return totalFibre;
	}
	public void setTotalFibre(float totalFibre) {
		this.totalFibre = totalFibre;
	}
	public float getTotalFat() {
		return totalFat;
	}
	public void setTotalFat(float totalFat) {
		this.totalFat = totalFat;
	}
	public float getCalcium() {
		return calcium;
	}
	public void setCalcium(float calcium) {
		this.calcium = calcium;
	}
	public String getCatagory1() {
		return catagory1;
	}
	public void setCatagory1(String catagory1) {
		this.catagory1 = catagory1;
	}
	public String getCatagory2() {
		return catagory2;
	}
	public void setCatagory2(String catagory2) {
		this.catagory2 = catagory2;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	

}
