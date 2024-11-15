package com.regal.EmployeeProject.web.EmployeeProject.dao;

import org.springframework.stereotype.Repository;

import com.regal.EmployeeProject.web.EmployeeProject.model.EmployeeModel;

@Repository
public interface IEmployeeDao {
	EmployeeModel findById(Integer sso);
	void update(EmployeeModel employeeModel);
}