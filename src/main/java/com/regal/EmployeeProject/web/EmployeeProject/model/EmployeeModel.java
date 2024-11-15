package com.regal.EmployeeProject.web.EmployeeProject.model;

import java.sql.Date;

public class EmployeeModel {
	private Integer sso;
	private String employeeType;
	private String firstName;
	private String middleName;
	private String lastName;
	private String preferredName;
	private String gender;
	private String position;
	private String email;
	private String businessGroup;
	private String subBusinessGroup;
	private Date hireDate;
	private String classification;
	private String country;
	private String location;
	private String organization;
	private String function;
	private String businessUnit;
	private String reportEntity;
	private Date terminateDate;
	
	
	public Integer getSso() {
		return sso;
	}
	public void setSso(Integer sso) {
		this.sso = sso;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPreferredName() {
		return preferredName;
	}
	public void setPreferredName(String preferredName) {
		this.preferredName = preferredName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBusinessGroup() {
		return businessGroup;
	}
	public void setBusinessGroup(String businessGroup) {
		this.businessGroup = businessGroup;
	}
	public String getSubBusinessGroup() {
		return subBusinessGroup;
	}
	public void setSubBusinessGroup(String subBusinessGroup) {
		this.subBusinessGroup = subBusinessGroup;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public String getReportEntity() {
		return reportEntity;
	}
	public void setReportEntity(String reportEntity) {
		this.reportEntity = reportEntity;
	}
	public Date getTerminateDate() {
		return terminateDate;
	}
	public void setTerminateDate(Date terminateDate) {
		this.terminateDate = terminateDate;
	}
	
	
	@Override
	public String toString() {
		return "EmployeeModel [Sso=" + sso + ", employeeType=" + employeeType + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", preferredName=" + preferredName
				+ ", gender=" + gender + ", position=" + position + ", email=" + email + ", businessGroup="
				+ businessGroup + ", subBusinessGroup=" + subBusinessGroup + ", hireDate=" + hireDate
				+ ", classification=" + classification + ", country=" + country + ", location=" + location
				+ ", organization=" + organization + ", function=" + function + ", businessUnit=" + businessUnit
				+ ", reportEntity=" + reportEntity + ", terminateDate=" + terminateDate + "]";
	}
	
	
}