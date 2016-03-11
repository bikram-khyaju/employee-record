package com.angular.employee.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.angular.employee.model.Employee;

@Service
public interface EmployeeService {

	public void save(Employee employee);

	

}
