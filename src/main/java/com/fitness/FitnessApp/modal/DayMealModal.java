package com.fitness.FitnessApp.modal;

public class DayMealModal {
	private String date;
	private Object[] breakfast;
	private Object[] lunch;
	private Object[] snacks_1;
	private Object[] dinner;
	private Object[] snacks_2;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Object[] getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(Object[] breakfast) {
		this.breakfast = breakfast;
	}

	public Object[] getLunch() {
		return lunch;
	}

	public void setLunch(Object[] lunch) {
		this.lunch = lunch;
	}

	public Object[] getsnacks_1() {
		return snacks_1;
	}

	public void setsnacks_1(Object[] snacks_1) {
		this.snacks_1 = snacks_1;
	}

	public Object[] getDinner() {
		return dinner;
	}

	public void setDinner(Object[] dinner) {
		this.dinner = dinner;
	}

	public Object[] getsnacks_2() {
		return snacks_2;
	}

	public void setsnacks_2(Object[] snacks_2) {
		this.snacks_2 = snacks_2;
	}
}
