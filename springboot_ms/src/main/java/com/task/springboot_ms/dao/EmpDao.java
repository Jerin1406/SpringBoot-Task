package com.task.springboot_ms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.springboot_ms.entity.Employee;

public interface EmpDao extends JpaRepository<Employee, Integer> {

}
