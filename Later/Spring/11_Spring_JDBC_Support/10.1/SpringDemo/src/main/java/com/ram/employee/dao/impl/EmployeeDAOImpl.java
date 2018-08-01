package com.ram.employee.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ram.employee.dao.EmploeyeeDAO;

public class EmployeeDAOImpl
		extends JdbcDaoSupport implements EmploeyeeDAO
{

	public int findTotalEmployeeByAge(int age)
	{
		String sql = "SELECT COUNT(*) FROM EMPLOYEE where AGE=?";

		int count = getJdbcTemplate().queryForObject(
                sql, Integer.class,age);

		return count;
	}

}
