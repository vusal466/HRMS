package com.project.hrms.entites.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class IsArayanlar extends Users{

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="employee_id")
	private int employeelId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="birdth_of_day")
	private Date dateOfBirth;
	
	@Column(name="tcno")
	private String tcno;
	

	
	public IsArayanlar() {
		
	}
	
	public IsArayanlar(int id, int employeeId, String name, String surname, Date dateOfBirth, String tcno) {
		super();
		this.id = id;
		this.employeelId=employeeId;
		this.name = name;
		this.surname = surname;
		this.dateOfBirth=dateOfBirth;
		this.tcno = tcno;
		
	}

	public int getId() {
		return id;
	}

	public int getEmployeelId() {
		return employeelId;
	}

	public void setEmployerlId(int employeelId) {
		this.employeelId = employeelId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTcno() {
		return tcno;
	}

	public void setTcno(String tcno) {
		this.tcno = tcno;
	}

	
	
}
