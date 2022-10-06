package com.branchsetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.branchsetup.model.ResourcePersonalDetails;

@Repository
public interface ResourcePersonalDetailsRepo extends JpaRepository<ResourcePersonalDetails, Integer> {

}
