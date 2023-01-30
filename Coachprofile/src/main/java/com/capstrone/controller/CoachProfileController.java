package com.capstrone.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstrone.exception.CoachException;
import com.capstrone.request.CoachProfileRequest;
import com.capstrone.response.CoachProfileResponse;
import com.capstrone.service.CoachProfileService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/coachProfile")
public class CoachProfileController {
	
	
	@Autowired
	CoachProfileService coachProfileService;
	@Autowired
	private Environment environment;
	@PostMapping("/addCoach")
	public ResponseEntity<String> addCoachProfile(@RequestBody @Valid CoachProfileRequest coachProfileRequest) {
		CoachProfileResponse coachProfileResponse = coachProfileService.addCoachProfile(coachProfileRequest);
		String successMessage = environment.getProperty("API.INSERT_SUCCESS") + coachProfileResponse.getId();
		return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
		
			
	}
	@GetMapping("/getCoachProfile/{id}")
	public ResponseEntity<Object> getCoachProfile(@PathVariable int id) {
		CoachProfileResponse coachProfileResponse;
		try {
			coachProfileResponse = coachProfileService.getCoachProfile(id);
			return new ResponseEntity<>(coachProfileResponse, HttpStatus.OK);
		} catch (CoachException exception) {
			
			return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
			
	}

}
