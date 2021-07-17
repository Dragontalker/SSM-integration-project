package com.dragontalker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("/emps")
	public String getEmps() {
		return "list";
	}
}
