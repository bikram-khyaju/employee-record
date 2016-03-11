package com.angular.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.angular.employee.model.Employee;
import com.angular.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
/*	@RequestMapping(value="/addEmployee", method=RequestMethod.GET)
	public String addEmployee(){
		return "template/addEmployee";
	}
	@RequestMapping(value="/addEmployee", method=RequestMethod.POST)
	public void addEmployee(@ModelAttribute("employee") Employee employee){
		employeeService.save(employee);
		return "template/addEmployee";
	}*/
	
}
