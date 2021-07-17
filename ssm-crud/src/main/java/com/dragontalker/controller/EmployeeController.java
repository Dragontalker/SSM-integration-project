package com.dragontalker.controller;

import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {

	public String getEmps() {
		return "list";
	}
}
