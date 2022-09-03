package com.satyam.department.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.satyam.department.entity.Department;
import com.satyam.department.service.DepartmentService;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;


//microservice - departmentService
@Slf4j
@RestController
@RequestMapping("/departments")
public class DepartmentController {
//service is autowired into controller
	@Autowired
	private DepartmentService departmentService;
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		Log.info("Inside saveDepartment method of DepartmentController");
		return departmentService.saveDepartment(department);

	}
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId)
	{
		Log.info("Inside findDepartmentById method of DepartmentService");
		return departmentService.findDepartmentById(departmentId);

	}
	@RequestMapping("/HelloWorld")
	public ModelAndView firstPage() {
		return new ModelAndView("helloworld");
	}

}
