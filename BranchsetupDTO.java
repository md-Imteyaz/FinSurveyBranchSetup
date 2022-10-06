package com.branchsetup.dto;

import com.branchsetup.model.BranchSetUp;

public class BranchsetupDTO {

	private BranchSetUp branchsetup;

	public BranchSetUp getBranchsetup() {
		return branchsetup;
	}

	public void setBranchsetup(BranchSetUp branchsetup) {
		this.branchsetup = branchsetup;
	}

	public BranchsetupDTO() {
		super();
	}

	public BranchsetupDTO(BranchSetUp branchsetup) {
		super();
		this.branchsetup = branchsetup;
	}

	@Override
	public String toString() {
		return "BranchsetupDTO [branchsetup=" + branchsetup + "]";
	}

}
