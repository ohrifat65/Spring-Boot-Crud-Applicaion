package com.crud.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class empModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eId;
	private String fName;
	private String lName;
	private String position;
	private double salary;
	private String phone;
	private String mail;
	private String pWord;

	public empModel() {
		super();
	}

	public empModel(int eId, String fName, String lName, String position, double salary, String phone, String mail,
			String pWord) {
		super();
		this.eId = eId;
		this.fName = fName;
		this.lName = lName;
		this.position = position;
		this.salary = salary;
		this.phone = phone;
		this.mail = mail;
		this.pWord = pWord;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int id) {
		this.eId = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String eMail) {
		this.mail = eMail;
	}

	public String getpWord() {
		return pWord;
	}

	public void setpWord(String pWord) {
		this.pWord = pWord;
	}

}
