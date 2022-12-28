package com.task.springboot_ms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	private int emp_id;
	@Column
	private String emp_name;
	@Column
	private String project;
	@Column
	private String role;
	public Employee() {
		
	}
	public Employee(int emp_id, String emp_name, String project, String role) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.project = project;
		this.role = role;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
