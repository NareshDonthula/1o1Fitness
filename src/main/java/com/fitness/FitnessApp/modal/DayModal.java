package com.fitness.FitnessApp.modal;

public class DayModal {
	private int id;
	private String date;
	private Object[] frequency;
	private String start;
	private String end;
	private String title;
	private String trainerId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}

	private Object[] slots;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Object[] getFrequency() {
		return frequency;
	}

	public void setFrequency(Object[] frequency) {
		this.frequency = frequency;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Object[] getSlots() {
		return slots;
	}

	public void setSlots(Object[] slots) {
		this.slots = slots;
	}
}
