package com.greatlearnings.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.greatlearnings.entity.Employee;
import com.greatlearnings.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeServiceImpl empService;
	
	@GetMapping("/employees")
	public List<Employee> findAll() {
		return empService.findAll();
	}

	/*
	 * @GetMapping("/employees/{employeeId}") public Employee getEmployee() {
	 * 
	 * }
	 */

}
