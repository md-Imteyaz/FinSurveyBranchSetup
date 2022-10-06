package com.branchsetup.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "records")
public class Records {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rId;
	private String particular;
	private boolean value;
	private int assetId;

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getParticular() {
		return particular;
	}

	public void setParticular(String particular) {
		this.particular = particular;
	}

	public boolean isValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}

	public int getAssetId() {
		return assetId;
	}

	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}

	public Records(int rId, String particular, boolean value, int assetId) {
		super();
		this.rId = rId;
		this.particular = particular;
		this.value = value;
		this.assetId = assetId;
	}

	public Records() {
		super();
	}

	@Override
	public String toString() {
		return "Records [rId=" + rId + ", particular=" + particular + ", value=" + value + ", assetId=" + assetId + "]";
	}

}
