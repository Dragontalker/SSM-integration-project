package com.dragontalker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dragontalker.bean.Employee;
import com.dragontalker.dao.EmployeeMapper;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeMapper employeeMapper;

	public List<Employee> getAll() {
		List<Employee> emps = employeeMapper.selectByExampleWithDept(null);
		return emps;
	}

}
