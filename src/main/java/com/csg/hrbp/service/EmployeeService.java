package com.csg.hrbp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csg.hrbp.DTO.Employee;
import com.csg.hrbp.DTO.Role;
import com.csg.hrbp.entity.Departments;
import com.csg.hrbp.entity.EmployeeMaster;
import com.csg.hrbp.entity.Roles;
import com.csg.hrbp.repo.EmployeeRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeService {
	
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@Autowired
	EmployeeMaster employeeMaster;
	@Autowired
	Departments departments;
	@Autowired
	Roles roles;
	
	public Optional<EmployeeMaster> getEmployee(Integer id) {
		log.info("getEmployee(-)");
		return employeeRepo.findById(id);
	}

	

	    public void saveEmployee(Employee employee) {
	    	
	    	employeeMaster.setEmployeeId(employee.getEmployeeId());;
	    	employeeMaster.setFirstName(employee.getFirstName());
	    	employeeMaster.setLastName(employee.getLastName());
	    	employeeMaster.setJoiningDate(employee.getJoiningDate());
	    	
	    	EmployeeMaster manager = employeeRepo.findById(employee.getManagerId()).orElse(null);
	        EmployeeMaster buHead = employeeRepo.findById(employee.getBuHeadId()).orElse(null);
	   
	    	
	    	//setting departments
	    	departments.setDepartmentId(employee.getDepartment().getDepartmentId());
	    	departments.setDepartmentName(employee.getDepartment().getDepartmentName());
	    	
	    	//setting roles
	    	roles.setRoleId(employee.getRole().getRoleId());
	    	roles.setJobTitle(employee.getRole().getJobTitle());
	    	roles.setRoleName(employee.getRole().getRoleName());
	    	
	    	employeeMaster.setDepartment(departments);
	    	employeeMaster.setRole(roles);
	    	
	    	
	    	employeeRepo.save(employeeMaster);
	    	
//	    	return "employee saved";
	    }
}
