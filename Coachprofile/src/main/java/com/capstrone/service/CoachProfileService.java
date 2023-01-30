package com.capstrone.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.capstrone.entity.CoachProfile;
import com.capstrone.exception.CoachException;
import com.capstrone.repository.CoachProfileRepository;
import com.capstrone.request.CoachProfileRequest;
import com.capstrone.response.CoachProfileResponse;

@Service
public class CoachProfileService {
	
	@Autowired
	CoachProfileRepository coachProfileRepository;
	@Autowired
	Environment environment;
	
	public CoachProfileResponse addCoachProfile(CoachProfileRequest coachProfileRequest) {
		CoachProfile coachProfile = new CoachProfile();
		coachProfile.setName(coachProfileRequest.getName());
		coachProfile.setPasssword(coachProfileRequest.getPasssword());
		coachProfile.setMobilenumber(coachProfileRequest.getMobilenumber());
		coachProfile.setGender(coachProfileRequest.getGender());
		coachProfile.setDob(coachProfileRequest.getDob());
		coachProfile.setSpeciality(coachProfileRequest.getSpeciality());
		coachProfileRepository.save(coachProfile);
		
		return new CoachProfileResponse(coachProfile);
		
	}
	public CoachProfileResponse getCoachProfile(int id) throws CoachException {
		String exception =environment.getProperty("Service.COACH_NOT_FOUND");
		Optional<CoachProfile> optional =coachProfileRepository.findById(id);
		CoachProfile coachProfile = optional.orElseThrow(() -> new CoachException(exception));

		return new CoachProfileResponse(coachProfile);
	}
}
