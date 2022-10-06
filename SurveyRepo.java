package com.branchsetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.branchsetup.model.Survey;

@Repository
public interface SurveyRepo extends JpaRepository<Survey, Integer> {

}
