package com.ram.employee.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ram.employee.dao.EmploeyeeDAO;

public class EmployeeDAOImpl
		extends JdbcDaoSupport implements EmploeyeeDAO
{

	public String findEmployeeNameById(int employeeId)
	{
		String sql = "SELECT NAME FROM EMPLOYEE WHERE EMPLOYEE_ID=?";

		String name = (String) getJdbcTemplate().queryForObject(sql,
				new Object[] { employeeId }, String.class);

		return name;
	}

}
