package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Department;
import com.example.demo.Repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository deptReop;
	
	public Department saveDepartment(Department department) {
		return deptReop.save(department);
	}

	public Department getDepartment(Long deptId) {
		return deptReop.findByDeptId(deptId);
	}
}
