package com.user.registration.model;

public class User {
	
	private String id;
	private String firstNm;
	private String lastNm;
	private String addressLine;
	private String city;
	private String state;
	private String country;
	
	public User(){
		
	}
	
	public User(String id, String firstNm, String lastNm, String addressLine, String city, String state,
			String country) {
		super();
		this.id = id;
		this.firstNm = firstNm;
		this.lastNm = lastNm;
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstNm() {
		return firstNm;
	}
	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}
	public String getLastNm() {
		return lastNm;
	}
	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	

}
