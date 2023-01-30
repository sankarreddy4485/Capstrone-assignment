package com.capstrone.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class CoachProfileRequest {
	@NotBlank(message = "name is required.")
	@Size(min = 3, max = 50, message = "username is too long.")
	private String name;
	@NotBlank(message = "Password is required")
	@Size(min = 5, max = 10, message = "Password should be between 5 to 10 charcters")
	private String passsword;
	@NotBlank(message = "DOB is required")
	
	private String dob;
	@NotBlank
	private String gender;
	@NotBlank(message = "mobileNumber is required")
	@Size(min = 10, max = 10)
	private String mobilenumber;
	@NotBlank(message = "speciality is required")
	@Size(min = 10, max = 50)
	private String speciality;

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

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}
