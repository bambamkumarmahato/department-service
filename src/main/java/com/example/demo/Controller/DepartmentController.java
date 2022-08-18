package com.example.demo.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Department;
import com.example.demo.Service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService deptSerive;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		System.out.println("inside department");
		LOGGER.info("inside in save department");
		return deptSerive.saveDepartment(department);
	}
	
	@GetMapping("/{deptId}")
	public Department getDepartment(@PathVariable Long deptId) {
		LOGGER.info("inside in get department");
		return deptSerive.getDepartment(deptId);
	}
}
