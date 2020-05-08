package com.springmvc.springboot.student;

import java.util.LinkedHashMap;

public class StudentEx {
	private String firstName;
	private String lastName;
	private String Counttry;
	private String favourtelang;
	private String operatingsystems;
	private LinkedHashMap<String, String> countryOptions;
	public StudentEx() {
		countryOptions= new LinkedHashMap<String, String>();
		countryOptions.put("br", "Brazil");
		countryOptions.put("ind", "india");
		countryOptions.put("usa", "america");
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCounttry() {
		return Counttry;
	}

	public void setCounttry(String counttry) {
		Counttry = counttry;
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

	public String getFavourtelang() {
		return favourtelang;
	}

	public void setFavourtelang(String favourtelang) {
		this.favourtelang = favourtelang;
	}

	public String getOperatingsystems() {
		return operatingsystems;
	}

	public void setOperatingsystems(String operatingsystems) {
		this.operatingsystems = operatingsystems;
	}
	

}
