package com.regal.EmployeeProject.web.EmployeeProject.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.regal.EmployeeProject.web.EmployeeProject.model.EmployeeModel;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao{
	
	JdbcTemplate jdbc;
	
	@Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@SuppressWarnings("deprecation")
	@Override
	public EmployeeModel findById(Integer sso) {
//		System.out.println("getEmployeeDetails called REPO");
		String sql = "SELECT SSO, employeeType, firstName, middleName, lastName, prefferedName, gender, position, email, businessGroup, subBusinessGroup, hireDate, classification, country, location, organization, `function`, businessUnit, reportEntity, terminateDate FROM employeetable where SSO = ?;";
		try {
			RowMapper<EmployeeModel> mapper = (rs, rowNum) -> {
				EmployeeModel m = new EmployeeModel();
				m.setSso(rs.getInt("SSO"));
				m.setEmployeeType(rs.getString("employeeType"));
				m.setFirstName(rs.getString("firstName"));
				m.setMiddleName(rs.getString("middleName"));
				m.setLastName(rs.getString("lastName"));
				m.setPreferredName(rs.getString("prefferedName"));
				m.setGender(rs.getString("gender"));
				m.setPosition(rs.getString("position"));
				m.setEmail(rs.getString("email"));
				m.setBusinessGroup(rs.getString("businessGroup"));
				m.setSubBusinessGroup(rs.getString("subBusinessGroup"));
				m.setHireDate(rs.getDate("hireDate"));
				m.setClassification(rs.getString("classification"));
				m.setCountry(rs.getString("country"));
				m.setLocation(rs.getString("location"));
				m.setOrganization(rs.getString("organization"));
				m.setFunction(rs.getString("function"));
				m.setBusinessUnit(rs.getString("businessUnit"));
				m.setReportEntity(rs.getString("reportEntity"));
				m.setTerminateDate(rs.getDate("terminateDate"));
				return m;
			};
			EmployeeModel query = jdbc.queryForObject(sql, new Object[]{sso}, mapper);
			System.out.println("Employee Details at repository: " + query);
			return query;
		} catch (Exception EmptyResultDataAccessException) {
			System.out.println("No Data for the given SSO ID");
			return null;
		}
	}

	@Override
	public void update(EmployeeModel employeeModel) {
		String sql = "UPDATE employeetable SET employeeType = ?,  firstName = ?, middleName = ?, lastName = ?, prefferedName = ?, gender = ?, position = ?, email = ?, businessGroup = ?, subBusinessGroup = ?, hireDate = ?, classification = ?, country = ?, location = ?, organization = ?, `function` = ?, businessUnit = ?, reportEntity = ?, terminateDate = ? WHERE SSO = ?";
		int rowAffected = jdbc.update(sql, employeeModel.getEmployeeType(), employeeModel.getFirstName(), employeeModel.getMiddleName(),
				employeeModel.getLastName(), employeeModel.getPreferredName(), employeeModel.getGender(), employeeModel.getPosition(),
				employeeModel.getEmail(), employeeModel.getBusinessGroup(), employeeModel.getSubBusinessGroup(), employeeModel.getHireDate(),
				employeeModel.getClassification(), employeeModel.getCountry(), employeeModel.getLocation(), employeeModel.getOrganization(),
				employeeModel.getFunction(), employeeModel.getBusinessUnit(), employeeModel.getReportEntity(), employeeModel.getTerminateDate(), employeeModel.getSso());
		if (rowAffected > 0) {
			System.out.println("Data Updated Succesfully!!");
		} else {
			System.out.println("No Data for the given SSO ID");
		}
	}
	
	
}