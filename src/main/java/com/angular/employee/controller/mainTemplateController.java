package com.angular.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class mainTemplateController {
	
	
	@RequestMapping("/home")
	public String home(){
		return "template/home";
	}
	@RequestMapping("/courses")
	public String courses(){
		return "template/courses";
	}
	@RequestMapping("/studentList")
	public String studentList(){
		return "template/studentList";
	}
	
	}
