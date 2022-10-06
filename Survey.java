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
@Table(name = "survey")
public class Survey {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int surveyId;
	private String title;

	@OneToMany(targetEntity = ParticularRecords.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "sp_fk", referencedColumnName = "surveyId")
	private List<ParticularRecords> particularrecords;

	public int getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<ParticularRecords> getParticularrecords() {
		return particularrecords;
	}

	public void setParticularrecords(List<ParticularRecords> particularrecords) {
		this.particularrecords = particularrecords;
	}

	public Survey(int surveyId, String title, List<ParticularRecords> particularrecords) {
		super();
		this.surveyId = surveyId;
		this.title = title;
		this.particularrecords = particularrecords;
	}

	public Survey() {
		super();
	}

	@Override
	public String toString() {
		return "Survey [surveyId=" + surveyId + ", title=" + title + ", particularrecords=" + particularrecords + "]";
	}

}
