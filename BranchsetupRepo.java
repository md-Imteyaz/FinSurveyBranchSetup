package com.branchsetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.branchsetup.model.BranchSetUp;

@Repository
public interface BranchsetupRepo extends JpaRepository<BranchSetUp,Integer> {

}
