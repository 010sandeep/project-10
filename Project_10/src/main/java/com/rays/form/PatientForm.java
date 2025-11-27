package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PatientDTO;

public class PatientForm extends BaseForm {

	@NotEmpty
	private String fullName;

	@NotEmpty
	private String gender;

	@NotNull
	private int age;

	@NotEmpty
	private String phoneNo;

	@NotEmpty
	private String address;

	@NotEmpty
	private String disease;

	@NotNull
	private Date addmissionDate;

	@Override
	public BaseDTO getDto() {
		PatientDTO dto = initDTO(new PatientDTO());

		dto.setFullName(fullName);
		dto.setGender(gender);
		dto.setAge(age);
		dto.setPhoneNo(phoneNo);
		dto.setAddress(address);
		dto.setDisease(disease);
		dto.setAddmissionDate(addmissionDate);

		return dto;
	}

}
