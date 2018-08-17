package com.ram.employee.dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.ram.employee.dao.EmploeyeeDAO;
import com.ram.employee.model.Employee;

public class EmployeeDAOImpl implements EmploeyeeDAO
{

	private SimpleJdbcInsert simpleJdbcInsert;

	public void setDataSource(DataSource dataSource)
	{
		this.simpleJdbcInsert = new SimpleJdbcInsert(dataSource)
				.withTableName("EMPLOYEE");

	}

	public void insert(Employee employee)
	{
		Map<String, Object> parameters = new HashMap<String, Object>(
				3);
		parameters.put("NAME", employee.getName());
		parameters.put("AGE", employee.getAge());
		parameters.put("SALARY", employee.getSalary());
		simpleJdbcInsert.execute(parameters);
	}
}
