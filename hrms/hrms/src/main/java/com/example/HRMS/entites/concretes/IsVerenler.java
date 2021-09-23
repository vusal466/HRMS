package com.project.hrms.entites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employers")
public class IsVerenler extends Users{

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="employer_id")
	private int employerlId;
	
	@Column(name="company_name")
	private String companyName;
	
	
	
	public IsVerenler() {
		
	}

	public IsVerenler(int id, int employerId, String companyName) {
		super();
		this.id = id;
		this.employerlId=employerId;
		this.companyName = companyName;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public int getEmployerlId() {
		return employerlId;
	}

	public void setEmployerlId(int employerlId) {
		this.employerlId = employerlId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
