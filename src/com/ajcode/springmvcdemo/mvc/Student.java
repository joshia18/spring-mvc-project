package com.ajcode.springmvcdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public Student() {
		countryOptions = new LinkedHashMap<>();
		//value, label - label is what you see in the drop down
		countryOptions.put("BRA", "Brazil");
		countryOptions.put("FRA", "France");
		countryOptions.put("GER", "germany");
		countryOptions.put("IND", "India");
		countryOptions.put("US", "United States");
		
		favoriteLanguageOptions = new LinkedHashMap<>();
		//value, label - label is what you see in the radio buttons
		favoriteLanguageOptions.put("Java", "java");
		favoriteLanguageOptions.put("C#", "c#");
		favoriteLanguageOptions.put("Php", "php");
		favoriteLanguageOptions.put("Kotlin", "kotlin");
	}
	
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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
	
}
