package com.userprofile.repsoitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userprofile.entity.UserProfile;
@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Integer> {

}
