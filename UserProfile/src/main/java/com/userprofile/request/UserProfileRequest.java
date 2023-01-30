package com.userprofile.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserProfileRequest {
	@NotBlank(message = "name is required.")
	@Size(min = 3, max = 50, message = "username is too long.")
	private String name;
	@NotBlank(message = "Password is required")
	@Size(min = 5, max = 10, message = "Password should be between 5 to 10 charcters")
	private String passsword;
	@NotBlank(message = "DOB is required")
	private String dob;
	@NotBlank(message = "Gender is required")
	private String gender;
	@NotBlank(message = "mobileNumber is required")
	@Size(min = 10, max = 10)
	private String mobilenumber;
	@NotBlank(message = "emai is required")
	@Email
	private String email;
	@NotBlank(message = "Pincode is required")
	@Size(min = 6, max = 6,message = "pincode should be 6 characters")
	private String pincode;
	@NotBlank(message = "city is required")
	@Size(min = 6, max = 20,message = "city should be between 6 to 20 characters")
	private String city;
	@NotBlank(message = "city is required")
	@Size(min = 6, max = 20,message = "State should be between 6 to 20 characters")
	private String state;
	@NotBlank(message = "city is required")
	@Size(min = 5, max = 20,message = "Country should be between 6 to 20 characters")
	private String country;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
