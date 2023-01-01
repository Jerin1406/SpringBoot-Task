package com.task.springboot_ms.service;

import java.util.ArrayList;
import java.util.Iterator;
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
		return "Successfully Added";
	}
	public String addEmps(List<Employee> employee) {
		dao.saveAll(employee);
		return "Added";
	}
	public Employee getEmp(int emp_id) {
		return dao.findById(emp_id).get();
		
	}
	public List<Employee> getMultipleEmp(String emp_id) {
		List<Employee>list=new ArrayList<Employee>();
		String[] split=emp_id.split("[,]",0);
		//System.out.println(split);
		for(String id: split) {
			//System.out.println(id);
			Employee emp=dao.findById(Integer.parseInt(id)).get();
			list.add(emp);
		}
		return list;
	}
	public List<Employee> getMulEmppl(List<Employee> employee) {
		List<Employee>list=new ArrayList<Employee>();
		for(Employee r : employee) {
	        System.out.println(r.getEmp_id());
	        Employee emp=dao.findById(r.getEmp_id()).get();
			list.add(emp);
	    }
		return list;
	}
}
