package com.branchsetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.branchsetup.model.Records;

@Repository
public interface RecordsRepo extends JpaRepository<Records, Integer> {

}
