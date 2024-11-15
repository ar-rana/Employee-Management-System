package com.regal.EmployeeProject.web.EmployeeProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regal.EmployeeProject.web.EmployeeProject.dao.EmployeeDaoImpl;
import com.regal.EmployeeProject.web.EmployeeProject.model.EmployeeModel;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	EmployeeDaoImpl repo;
	
	@Autowired
	public void setRepo(EmployeeDaoImpl repo) {
		this.repo = repo;
	}

	@Override
	public EmployeeModel getEmployeeDetails(Integer sso) {
		return repo.findById(sso);

	}

	@Override
	public void updateEmployeeDetails(EmployeeModel employeeModel) {
		repo.update(employeeModel);
	}
	
}