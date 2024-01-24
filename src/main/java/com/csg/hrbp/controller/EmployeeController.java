package com.csg.hrbp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.csg.hrbp.DTO.Employee;
import com.csg.hrbp.entity.EmployeeMaster;
import com.csg.hrbp.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
//@RequestMapping("")
@Slf4j
public class EmployeeController {

	
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/empDetails")
	public Optional<EmployeeMaster> getEmployee(@RequestParam Integer employeeId) {
		log.info(null);
		return employeeService.getEmployee(employeeId);
	}
	

	
	@PostMapping("/save")
    public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return ResponseEntity.ok("Employee saved successfully");
    }

	

//	@PostMapping("/saveDept")
//    public ResponseEntity<String> saveDept(@RequestBody Employee employee) {
//        employeeService.saveEmployee(employee);
//        return ResponseEntity.ok("Employee saved successfully");
//    }
}
