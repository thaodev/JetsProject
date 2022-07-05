package com.skilldistillery.jets.entities;

public class Pilot {
	private String name;
	private int yearsOfExperience;
	
	public Pilot(String name, int yearsOfExperience) {
		this.name = name;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public String toString() {
		return "Pilot [name=" + name + ", yearsOfExperience=" + yearsOfExperience + "]";
	}
	
	
	
}
