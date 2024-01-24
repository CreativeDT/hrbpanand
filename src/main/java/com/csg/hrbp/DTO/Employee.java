package com.csg.hrbp.DTO;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private Integer employeeId;
	private String firstName;
	private String lastName;
	private Role role;
	private Department department;
	private Integer managerId;
	private Integer buHeadId;
	private LocalDateTime joiningDate;

}
