package com.userprofile.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.userprofile.entity.UserProfile;
import com.userprofile.exception.UserException;
import com.userprofile.repsoitory.UserProfileRepository;
import com.userprofile.request.UserProfileRequest;
import com.userprofile.response.UserProfileResponse;

@Service
public class UserProfileService {
	@Autowired
	UserProfileRepository userProfileRepository;
	@Autowired
	Environment environment;
	
	public UserProfileResponse addUserprofile(UserProfileRequest userProfileRequest)throws Exception {
		
		UserProfile userProfile = new UserProfile();
		userProfile.setName(userProfileRequest.getName());
		userProfile.setPasssword(userProfileRequest.getPasssword());
		userProfile.setDob(userProfileRequest.getDob());
		userProfile.setCity(userProfileRequest.getCity());
		userProfile.setCountry(userProfileRequest.getCountry());
		userProfile.setEmail(userProfileRequest.getEmail());
		userProfile.setGender(userProfileRequest.getGender());
		userProfile.setMobilenumber(userProfileRequest.getMobilenumber());
		userProfile.setPincode(userProfileRequest.getPincode());
		userProfile.setState(userProfileRequest.getState());
		
				
		UserProfile userProfile2 =userProfileRepository.save(userProfile);
		return new UserProfileResponse(userProfile2);
		
	}
	public UserProfileResponse getUserprofile(int id)throws UserException {
		String exception =environment.getProperty("Service.USER_NOT_FOUND");
		Optional<UserProfile> optional =userProfileRepository.findById(id);
		UserProfile userProfile = optional.orElseThrow(() -> new UserException(exception));

		
		return new UserProfileResponse(userProfile);
		
		
	}
}
