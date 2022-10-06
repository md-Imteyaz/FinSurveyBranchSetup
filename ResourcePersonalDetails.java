package com.branchsetup.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resource_perosnal_details")
public class ResourcePersonalDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int resourceId;
	private String name;
	private String designation;
	private long contactNumber;

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public ResourcePersonalDetails(int resourceId, String name, String designation, long contactNumber) {
		super();
		this.resourceId = resourceId;
		this.name = name;
		this.designation = designation;
		this.contactNumber = contactNumber;
	}

	public ResourcePersonalDetails() {
		super();
	}

	@Override
	public String toString() {
		return "ResourcePersonalDetails [resourceId=" + resourceId + ", name=" + name + ", designation=" + designation
				+ ", contactNumber=" + contactNumber + "]";
	}

}
