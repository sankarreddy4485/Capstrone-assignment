package com.userprofile.controller;

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

import com.userprofile.exception.UserException;
import com.userprofile.request.UserProfileRequest;
import com.userprofile.response.UserProfileResponse;
import com.userprofile.service.UserProfileService;

@RestController
@RequestMapping("/api/userProfile")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserProfileController {

	@Autowired
	UserProfileService userProfileService;
	@Autowired
	Environment environment;
	@PostMapping("/addUserProfile")
	public ResponseEntity<String> addUserprofile(@Valid @RequestBody UserProfileRequest userProfileRequest) {
		try {
		   UserProfileResponse userProfileResponse =userProfileService.addUserprofile(userProfileRequest);
		   String successMessage = environment.getProperty("API.INSERT_SUCCESS") + userProfileResponse.getId();
			return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
		
		}catch(Exception e) {
			 String failureMessage = environment.getProperty("API.INSERT_FAILURE") + e.getMessage();
			return new ResponseEntity<>(failureMessage, HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
	@GetMapping("/getUserProfile/{id}")
	public ResponseEntity<Object> getUserProfile(@PathVariable int id) {
		UserProfileResponse userProfileResponse;
		try {
			userProfileResponse = userProfileService.getUserprofile(id);
			return new ResponseEntity<>(userProfileResponse, HttpStatus.OK);
		} catch (UserException exception) {
			
			return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
			
	}
}
