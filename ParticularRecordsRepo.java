package com.branchsetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.branchsetup.model.ParticularRecords;

@Repository
public interface ParticularRecordsRepo extends JpaRepository<ParticularRecords, Integer> {

}
