package com.dragontalker.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dragontalker.bean.Department;
import com.dragontalker.bean.Employee;
import com.dragontalker.dao.DepartmentMapper;
import com.dragontalker.dao.EmployeeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {

	@Autowired
	DepartmentMapper departmentMapper;
	
	@Autowired
	EmployeeMapper employeeMapper;
	
	@Test
	public void testCRUD() {
	
		System.out.println(departmentMapper);
		
		// 1. test insert
		//Department dept1 = new Department(null, "Development");
		//departmentMapper.insertSelective(dept1);
		
		//Department dept2 = new Department(null, "Test");
		//departmentMapper.insertSelective(dept2);
		
		// 2. test insert employee
		//Employee emp1 = new Employee(null, "Jerry", "M", "jerry@atguigu.com", 1);
		//employeeMapper.insertSelective(emp1);
		
		// 3. batch insert
		
	}
}
