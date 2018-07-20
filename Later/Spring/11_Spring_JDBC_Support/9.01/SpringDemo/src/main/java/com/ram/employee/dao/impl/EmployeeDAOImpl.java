package com.ram.employee.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ram.employee.dao.EmploeyeeDAO;

public class EmployeeDAOImpl
		extends JdbcDaoSupport implements EmploeyeeDAO
{

	public String findEmployeeNameByAgeAndSalary(int age, int salary)
	{
		String sql = "SELECT NAME FROM EMPLOYEE WHERE Age=? and SALARY=?";

		String name = getJdbcTemplate().queryForObject(sql,
				new Object[] { age, salary }, String.class);

		return name;
	}

}
