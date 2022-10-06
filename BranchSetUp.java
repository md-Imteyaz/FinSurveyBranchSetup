package com.branchsetup.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "branchSetup")
public class BranchSetUp {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	private boolean branchReadyForOps;
	private String comments;

	@OneToMany(targetEntity = ResourcePersonalDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "br_fk", referencedColumnName = "bid")
	private List<ResourcePersonalDetails> resourceperosnaldetails;
	@OneToMany(targetEntity = Survey.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "bs_fk", referencedColumnName = "bid")
	private List<Survey> survey;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public boolean isBranchReadyForOps() {
		return branchReadyForOps;
	}

	public void setBranchReadyForOps(boolean branchReadyForOps) {
		this.branchReadyForOps = branchReadyForOps;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public List<ResourcePersonalDetails> getResourceperosnaldetails() {
		return resourceperosnaldetails;
	}

	public void setResourceperosnaldetails(List<ResourcePersonalDetails> resourceperosnaldetails) {
		this.resourceperosnaldetails = resourceperosnaldetails;
	}

	public List<Survey> getSurvey() {
		return survey;
	}

	public void setSurvey(List<Survey> survey) {
		this.survey = survey;
	}

	public BranchSetUp(int bid, boolean branchReadyForOps, String comments,
			List<ResourcePersonalDetails> resourceperosnaldetails, List<Survey> survey) {
		super();
		this.bid = bid;
		this.branchReadyForOps = branchReadyForOps;
		this.comments = comments;
		this.resourceperosnaldetails = resourceperosnaldetails;
		this.survey = survey;
	}

	public BranchSetUp() {
		super();
	}

	@Override
	public String toString() {
		return "BranchSetUp [bid=" + bid + ", branchReadyForOps=" + branchReadyForOps + ", comments=" + comments
				+ ", resourceperosnaldetails=" + resourceperosnaldetails + ", survey=" + survey + "]";
	}

}
