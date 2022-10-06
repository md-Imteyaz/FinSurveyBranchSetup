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
@Table(name = "particularrecords")
public class ParticularRecords {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prId;
	private String particular;

	@OneToMany(targetEntity = Records.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "rp_fk", referencedColumnName = "prId")
	private List<Records> records;

	public int getPrId() {
		return prId;
	}

	public void setPrId(int prId) {
		this.prId = prId;
	}

	public String getParticular() {
		return particular;
	}

	public void setParticular(String particular) {
		this.particular = particular;
	}

	public List<Records> getRecords() {
		return records;
	}

	public void setRecords(List<Records> records) {
		this.records = records;
	}

	public ParticularRecords(int prId, String particular, List<Records> records) {
		super();
		this.prId = prId;
		this.particular = particular;
		this.records = records;
	}

	public ParticularRecords() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ParticularRecords [prId=" + prId + ", particular=" + particular + ", records=" + records + "]";
	}

}
