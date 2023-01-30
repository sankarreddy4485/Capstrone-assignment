package com.capstronelogin.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.capstronelogin.Exception.UserException;
import com.capstronelogin.entity.UserProfile;
import com.capstronelogin.repostory.UserLoginRepolsitory;
import com.capstronelogin.response.UserProfileResponse;
@Service
public class UserLoginService {


	@Autowired
	UserLoginRepolsitory userLoginRepolsitory;
	@Autowired
	Environment environment;
	public UserProfileResponse ValdidateUserDetails(int id) throws UserException {
		String errormessage =environment.getProperty("SERVICE.NO_USER_FOUND");
		Optional<UserProfile> optional = userLoginRepolsitory.findById(id);
		UserProfile userProfile =optional.orElseThrow(() -> new UserException(errormessage));
		return new UserProfileResponse(userProfile);
		
		
		}

}
