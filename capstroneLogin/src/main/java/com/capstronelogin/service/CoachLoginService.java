package com.capstronelogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstronelogin.entity.CoachProfile;
import com.capstronelogin.repostory.CoachLoginRepository;
import com.capstronelogin.response.CoachProfileResponse;
@Service
public class CoachLoginService {

	@Autowired
	CoachLoginRepository coachLoginRepository;
	public CoachProfileResponse ValdidateCoachDetails(int id) {
		CoachProfile coachProfile = coachLoginRepository.getById(id);
		return new CoachProfileResponse(coachProfile);
		
		
		}
}
