package com.capstronelogin.response;

import com.capstronelogin.entity.CoachProfile;

public class CoachProfileResponse {
	private int id;
	private String name;
	private String passsword;
	private String dob;
	private String gender;
	private String mobilenumber;
	private String speciality;

	

	public CoachProfileResponse(int id, String name, String passsword, String dob, String gender, String mobilenumber,
			String speciality) {
		super();
		this.id = id;
		this.name = name;
		this.passsword = passsword;
		this.dob = dob;
		this.gender = gender;
		this.mobilenumber = mobilenumber;
		this.speciality = speciality;
	}

	public CoachProfileResponse(CoachProfile coachProfile) {
		this.id = coachProfile.getId();
		this.name = coachProfile.getName();
		this.passsword = coachProfile.getPasssword();
		this.dob = coachProfile.getDob();
		this.gender = coachProfile.getGender();
		this.mobilenumber = coachProfile.getMobilenumber();
		this.speciality = coachProfile.getSpeciality();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "CoachProfileResponse [id=" + id + ", name=" + name + ", passsword=" + passsword + ", dob=" + dob
				+ ", gender=" + gender + ", mobilenumber=" + mobilenumber + ", speciality=" + speciality + "]";
	}

}
