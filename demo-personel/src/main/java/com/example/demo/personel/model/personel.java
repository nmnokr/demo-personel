package com.example.demo.personel.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Document(collection = "deneme")
@ApiModel(value = "User Api model documentation", description = "Model")

public class personel {
	@ApiModelProperty(value = "22")
	private int age;
	@ApiModelProperty(value = "0")
	private int childCount;
	@ApiModelProperty(value = "Turkey")
	private String citizenship;
	@ApiModelProperty(value = "testfotolink")
	private String employeePhoto;
	@ApiModelProperty(value = "01.01.2020")
	private String employmentStartDate;
	@ApiModelProperty(value = "01.01.2021")
	private String employmentTerminationDate;
	@ApiModelProperty(value = "Numan")
	private String firstName;
	@ApiModelProperty(value = "Male")
	private String gender;
	@ApiModelProperty(value = "01.01.2020")
	private String hireDate;
	@ApiModelProperty(value = "OKUR")
	private String lastName;
	@ApiModelProperty(value = "SINGLE")
	private String maritalStatus;
	@ApiModelProperty(value = "Computer Engineer")
	private String profession;
	@ApiModelProperty(value = "false")
	private Boolean retired;
	@ApiModelProperty(value = "22")
	private int salary;
	@ApiModelProperty(value = "3700")
	private String salaryCurrency;
	@ApiModelProperty(value = "TL")
	private String salaryPeriod;
 
	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getChildCount() {
		return childCount;
	}

	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public String getEmployeePhoto() {
		return employeePhoto;
	}

	public void setEmployeePhoto(String employeePhoto) {
		this.employeePhoto = employeePhoto;
	}

	public String getEmploymentStartDate() {
		return employmentStartDate;
	}

	public void setEmploymentStartDate(String employmentStartDate) {
		this.employmentStartDate = employmentStartDate;
	}

	public String getEmploymentTerminationDate() {
		return employmentTerminationDate;
	}

	public void setEmploymentTerminationDate(String employmentTerminationDate) {
		this.employmentTerminationDate = employmentTerminationDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Boolean getRetired() {
		return retired;
	}

	public void setRetired(Boolean retired) {
		this.retired = retired;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getSalaryCurrency() {
		return salaryCurrency;
	}

	public void setSalaryCurrency(String salaryCurrency) {
		this.salaryCurrency = salaryCurrency;
	}

	public String getSalaryPeriod() {
		return salaryPeriod;
	}

	public void setSalaryPeriod(String salaryPeriod) {
		this.salaryPeriod = salaryPeriod;
	}

}
