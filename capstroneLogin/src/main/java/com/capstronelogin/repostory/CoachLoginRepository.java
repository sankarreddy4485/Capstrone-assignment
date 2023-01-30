package com.capstronelogin.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstronelogin.entity.CoachProfile;
@Repository
public interface CoachLoginRepository extends JpaRepository<CoachProfile, Integer> {

}
