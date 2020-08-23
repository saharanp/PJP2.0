package com.sapient.IncomeCalc;

import java.util.HashMap;
import java.util.Map;

public class Read implements Comparable  {
	String countryName;
	String cityName;
	String gender;
	String currency;
	Double averageIncome;
	final Map<String,Double> convert = new HashMap<String,Double>(){
		{
			put("GBP",0.67);
			put("INR",66.0);
			put("SGD",1.5);
			put("HKD",8.0);	
		}
	};
	public Read(String city, String country, String gender, String currency, Double averageIncome) {
		super();
		this.countryName = country;
		this.cityName = city;
		this.gender = gender;
		this.currency = currency;
		this.averageIncome = averageIncome/convert.get(currency);
	}
	public String getCountry() {
		return countryName;
	}
	public void setCountry(String country) {
		this.countryName = country;
	}
	public String getCity() {
		return cityName;
	}
	public void setCity(String city) {
		this.cityName = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Double getAverageIncome() {
		return averageIncome;
	}
	public void setAverageIncome(Double averageIncome) {
		this.averageIncome = averageIncome;
	}
	@Override
	public String toString() {
		return countryName + "," + gender + "," + averageIncome + "\n";
	}
	@Override
	public int compareTo(Object obj) {
		Read obj1 = (Read)obj;
		int genderCompare = this.getGender().compareTo(obj1.getGender());
		int incomeCompare = this.getAverageIncome().compareTo(obj1.getAverageIncome());
		int countryCompare = this.getCountry().compareTo(obj1.getCountry());
		if(countryCompare == 0) {
			if(genderCompare == 0) {
				return incomeCompare;
			}
			else {
				return genderCompare;
			}
		}
		else {
			return countryCompare;
		}
	}
	
}

