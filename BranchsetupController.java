package com.branchsetup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.branchsetup.dto.BranchsetupDTO;
import com.branchsetup.model.BranchSetUp;
import com.branchsetup.model.ParticularRecords;
import com.branchsetup.model.Records;
import com.branchsetup.repository.BranchsetupRepo;
import com.branchsetup.repository.ResourcePersonalDetailsRepo;
import com.branchsetup.repository.SurveyRepo;

@RestController
@RequestMapping("/branchsetpApi")
public class BranchsetupController {

	@Autowired
	private BranchsetupRepo branchsetuprepo;
	@Autowired
	private ResourcePersonalDetailsRepo resourcepersonaldetailsrepo;
	@Autowired
	private SurveyRepo surveyrepo;
	@Autowired(required=false)
	private ParticularRecords particularrecords;
	@Autowired(required=false)
	private Records records;

	@PostMapping("/createbranchsetup")
	public ResponseEntity<BranchSetUp> save(@RequestBody BranchsetupDTO branchsetup) {
		branchsetuprepo.save(branchsetup.getBranchsetup());
		return new ResponseEntity<BranchSetUp>(HttpStatus.OK);
	}

	@GetMapping("/getBranchsetup")
	public List<BranchSetUp> findAll() {
		return branchsetuprepo.findAll();

	}
}
