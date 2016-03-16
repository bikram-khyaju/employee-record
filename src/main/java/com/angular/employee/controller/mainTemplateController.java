package com.angular.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.angular.employee.model.Employee;
import com.angular.employee.service.EmployeeService;


@Controller
public class mainTemplateController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/home")
	public String home(){
		return "template/home";
	}
	@RequestMapping("/courses")
	public String courses(){
		return "template/courses";
	}
	@RequestMapping("/employeeList")
	public String employeeList(){
		return "template/employeeList";
	}
	@RequestMapping("/addEmployee")
	public String addEmployee(){
		return "template/addEmployee";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public Employee saveEmployee(@RequestBody Employee employee){
		employeeService.save(employee);
		return employee;
	}
	
	@RequestMapping(value="/getAllEmployees",method=RequestMethod.GET)
	@ResponseBody
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
		
	}
	
	@RequestMapping(value="/deleteEmployee/{id}",method=RequestMethod.GET)
	@ResponseBody
	public void getAllEmployees(@PathVariable("id") Integer id){
		
		 employeeService.deleteEmployee(id);
		
	}
	@RequestMapping(value="/editEmployee/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Employee editEmployee(@PathVariable("id") Integer id){
		
		return employeeService.editEmployee(id);
		
	}
	@RequestMapping(value="/editEmployee", method=RequestMethod.GET)
	public String editEmployee(){
		return "template/addEmployee";
	}
	}
