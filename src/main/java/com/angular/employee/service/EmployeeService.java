package com.angular.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.angular.employee.model.Employee;

@Service
public interface EmployeeService {

	public void save(Employee employee);

	public List<Employee> getAllEmployees();

	public void deleteEmployee(Integer id);

	public Employee editEmployee(Integer id);

	

}
