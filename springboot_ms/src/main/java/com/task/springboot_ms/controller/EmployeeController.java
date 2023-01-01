package com.task.springboot_ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping("/employee/{emp_id}")
		public Employee getEmployee(@PathVariable int emp_id) {
		System.out.print(emp_id);
			return service.getEmp(emp_id);
		}
	@GetMapping("/mulemployee/{emp_id}")
	public ResponseEntity<List<Employee>> getMulEmployee(@PathVariable("emp_id") String emp_id) {
		System.out.print(emp_id);
		return new ResponseEntity<List<Employee>>(service.getMultipleEmp(emp_id),HttpStatus.FOUND);
	}
	@GetMapping(value="employee/getEmployee", consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getMulEmp(@RequestBody List<Employee> employee) {
		for(Employee r : employee) {
	        System.out.println(r.getEmp_id());
	    }
		//System.out.print("done");
		return service.getMulEmppl(employee);
		
	}
	
}
