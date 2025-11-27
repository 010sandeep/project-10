package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_patient")
public class PatientDTO extends BaseDTO{

	@Column(name = "FULL_NAME", length = 50)
	private String fullName;

	@Column(name = "GENDER", length = 50)
	private String gender;

	@Column(name = "AGE")
	private int age;

	@Column(name = "PHONE_NO", length = 50)
	private String phoneNo;

	@Column(name = "ADDRESS", length = 50)
	private String address;

	@Column(name = "DISEASE", length = 50)
	private String disease;
	
	@Column(name = "ADDMISSION_DATE")
	private Date addmissionDate;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public Date getAddmissionDate() {
		return addmissionDate;
	}

	public void setAddmissionDate(Date addmissionDate) {
		this.addmissionDate = addmissionDate;
	}

	

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return fullName;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "fullName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return fullName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return fullName;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		// TODO Auto-generated method stub
		return null;
	}

}
