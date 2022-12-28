package com.task.springboot_ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.springboot_ms.entity.Employee;
import com.task.springboot_ms.service.EmpService;

@RestController
public class EmployeeController {
	@Autowired
	private EmpService service;
	@PostMapping("employee/uploadEmployee")
	public String addEmp(@RequestBody Employee employee) {
		return service.addEmp(employee);
		
	}
	@PostMapping("employee/uploadAllEmployee")
	public String addEmp(@RequestBody List<Employee> employee) {
		return service.addEmps(employee);
		
	}
}
