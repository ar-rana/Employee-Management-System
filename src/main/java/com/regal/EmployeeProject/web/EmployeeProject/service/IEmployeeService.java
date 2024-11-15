package com.regal.EmployeeProject.web.EmployeeProject.service;

import org.springframework.stereotype.Service;

import com.regal.EmployeeProject.web.EmployeeProject.model.EmployeeModel;

@Service
public interface IEmployeeService {
	EmployeeModel getEmployeeDetails(Integer sso);
	void updateEmployeeDetails(EmployeeModel employeeModel); 
}