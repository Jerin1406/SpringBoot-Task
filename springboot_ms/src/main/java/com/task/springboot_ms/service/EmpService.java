package com.task.springboot_ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.springboot_ms.dao.EmpDao;
import com.task.springboot_ms.entity.Employee;

@Service
public class EmpService {
	@Autowired
	private EmpDao dao;
	public String addEmp(Employee employee) {
		dao.save(employee);
		return "Added";
	}
	public String addEmps(List<Employee> employee) {
		dao.saveAll(employee);
		return "Added";
	}
}
