package com.wickets;

import java.io.Serializable;


public class Inputs implements Serializable{
	private String name;
	private String email;
	private String age;
	private String PhoneNumber;
	private String textArea;
	private String country;
	private String gender;
	private Object languages;
	private boolean indian;
	private String password;
	private String Password1;
	public String getPassword() {
		return password;
	}

	public void setPassword(String pPassword) {
		password = pPassword;
	}

	public String getPassword1() {
		return Password1;
	}

	public void setPassword1(String pPassword1) {
		Password1 = pPassword1;
	}

	@Override
	public String toString() {
		return "Inputs [name=" + name + ", email=" + email + ", age=" + age + ", PhoneNumber=" + PhoneNumber + ", textArea="
				+ textArea + ", country=" + country + ", gender=" + gender + ", languages=" + languages + ", indian=" + indian
				+ ", password=" + password + ", Password1=" + Password1 + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String pName) {
		name = pName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String pEmail) {
		email = pEmail;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String pAge) {
		age = pAge;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String pPhoneNumber) {
		PhoneNumber = pPhoneNumber;
	}
	public String getTextArea() {
		return textArea;
	}
	public void setTextArea(String pTextArea) {
		textArea = pTextArea;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String pCountry) {
		country = pCountry;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String pGender) {
		gender = pGender;
	}
	public Object getLanguages() {
		return languages;
	}
	public void setLanguages(Object pLanguages) {
		languages = pLanguages;
	}
	public boolean isIndian() {
		return indian;
	}
	public void setIndian(boolean pIndian) {
		indian = pIndian;
	}


}