package com.ram.core;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.employee.dao.EmploeyeeDAO;
import com.ram.employee.model.Employee;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		EmploeyeeDAO employeeDAO = (EmploeyeeDAO) context
				.getBean("employeeDAO");
		List<Employee> employeeList = employeeDAO.findAll();
		System.out.println("employeeList = " + employeeList);
		System.out.println("size = " + employeeList.size());
	}
}
