package com.angular.employee.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.angular.employee.model.Employee;
import com.angular.employee.repository.EmployeeRepository;
import com.angular.employee.service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public void save(Employee employee) {
		employeeRepository.save(employee);
		
	}

}
