package com.capstronelogin.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstronelogin.entity.UserProfile;

public interface UserLoginRepolsitory extends JpaRepository<UserProfile, Integer> {

}
