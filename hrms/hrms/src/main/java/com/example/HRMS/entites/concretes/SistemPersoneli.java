package com.project.hrms.entites.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.GeneratedValue;


@Entity
@Table(name="system_personnel")
public class SistemPersoneli extends Users{

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="system_personel_id")
	private int personelId;
	
	@Column(name="ad")
	private String name;
	
	@Column(name="soyad")
	private String surname;
	
	@Column(name="tcno")
	private String tcno;
	
	@Column(name="dogum_yili")
	private Date dateOfBirth;
	
	 public SistemPersoneli() {
		// TODO Auto-generated constructor stub
	 
		
	}

	public SistemPersoneli(int id, int personelId, String name, String surname, String tcno, Date dateOfBirth) {
		super();
		this.id = id;
		this.personelId=personelId;
		this.name = name;
		this.surname = surname;
		this.tcno = tcno;
		this.dateOfBirth = dateOfBirth;
	
	}

	public int getId() {
		return id;
	}

	public int getPersonelId() {
		return personelId;
	}

	public void setPersonelId(int personelId) {
		this.personelId = personelId;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}


