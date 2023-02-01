package com.userprofile.response;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.userprofile.entity.UserProfile;

public class UserProfileResponse {

	private int id;
	private String name;
	private String passsword;
	private String dob;
	private String gender;
	private String mobilenumber;
	private String email;
	private String pincode;
	private String city;
	private String state;
	private String country;
	
	public UserProfileResponse(UserProfile userProfile) {
		this.id=userProfile.getId();
		this.passsword=userProfile.getPasssword();
		this.name=userProfile.getName();
		this.mobilenumber=userProfile.getMobilenumber();
		this.city=userProfile.getCity();
		this.state=userProfile.getState();
		this.email=userProfile.getEmail();
		this.country=userProfile.getCountry();
		this.pincode=userProfile.getPincode();
				
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPasssword() {
		return passsword;
	}
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
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
