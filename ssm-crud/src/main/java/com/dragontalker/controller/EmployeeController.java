package com.dragontalker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dragontalker.bean.Employee;
import com.dragontalker.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/emps")
	public String getEmps(
			@RequestParam(value="pn", defaultValue="1")Integer pn,
			@ModelAttribute Model model) {
		
		PageHelper.startPage(pn, 5);
		
		List<Employee> emps = employeeService.getAll();
		
		PageInfo page = new PageInfo(emps, 5);
		
		model.addAttribute("pageInfo", page);
		
		return "list";
	}
}
