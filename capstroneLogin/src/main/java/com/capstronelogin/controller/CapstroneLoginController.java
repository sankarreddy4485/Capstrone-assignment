package com.capstronelogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstronelogin.Exception.UserException;
import com.capstronelogin.response.CoachProfileResponse;
import com.capstronelogin.response.UserProfileResponse;
import com.capstronelogin.service.CoachLoginService;
import com.capstronelogin.service.UserLoginService;

@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CapstroneLoginController {

	@Autowired
	CoachLoginService coachLoginService;
	@Autowired
	UserLoginService userLoginService;

	@Autowired
	Environment environment;

	@GetMapping("/coachLogin/{id}/{password}")
	public ResponseEntity<String> validateCoachLogin(@PathVariable int id,@PathVariable String password) {
		CoachProfileResponse coachProfileResponse = coachLoginService.ValdidateCoachDetails(id);
		if (coachProfileResponse.getPasssword().equalsIgnoreCase(password)) {
			String successMessage = environment.getProperty("API.LOGIN_SUCESS");
			return new ResponseEntity<>(successMessage, HttpStatus.OK);
		} else {
			String failureMessage = environment.getProperty("API.LOGIN_FAILED");
			return new ResponseEntity<>(failureMessage, HttpStatus.BAD_REQUEST);
		}
		
	}
	@GetMapping("/userLogin/{id}/{password}")
	public ResponseEntity<String> validateUserLogin(@PathVariable int id,@PathVariable String password) {
		UserProfileResponse userProfileResponse;
		try {
			userProfileResponse = userLoginService.ValdidateUserDetails(id);
		
		if (userProfileResponse.getPasssword().equalsIgnoreCase(password)) {
			String successMessage = environment.getProperty("API.USER_LOGIN_SUCESS");
			return new ResponseEntity<>(successMessage, HttpStatus.OK);
		} else {
			String failureMessage = environment.getProperty("API.USER_LOGIN_FAILED");
			return new ResponseEntity<>(failureMessage, HttpStatus.BAD_REQUEST);
		}
		} catch (UserException userException) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(userException.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
	}

}
