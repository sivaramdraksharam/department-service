package com.satyam.department.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.satyam.department.entity.Department;
import com.satyam.department.repository.DepartmentRepository;

import jdk.internal.org.jline.utils.Log;

import org.slf4j.*;
import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	@PostMapping("/")
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		Log.info("Inside saveDepartment method of DepartmentService");
		return departmentRepository.save(department);
		
	}

	public Department findDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		return departmentRepository.findByDepartmentId(departmentId);
	}
	
	

}
