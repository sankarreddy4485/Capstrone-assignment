package com.capstrone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstrone.entity.CoachProfile;
@Repository
public interface CoachProfileRepository extends JpaRepository<CoachProfile, Integer> {

}
