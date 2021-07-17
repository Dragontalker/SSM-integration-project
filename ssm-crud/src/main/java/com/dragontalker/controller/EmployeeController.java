package com.dragontalker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dragontalker.bean.Employee;
import com.dragontalker.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/emps")
	public String getEmps() {
		
		List<Employee> emps = employeeService.getAll();
		return "list";
	}
}
