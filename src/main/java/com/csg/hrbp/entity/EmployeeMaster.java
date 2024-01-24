package com.csg.hrbp.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.stereotype.Component;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Component
@Table(name = "employee_master_table")
public class EmployeeMaster {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "roleId")
    private Roles role;
//
//    @ManyToOne
//    @JoinColumn(name = "departmentId")
//    private Department department;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "departmentId")
    private Departments department;


//    @ManyToOne
//    @JoinColumn(name = "managerId")
//    private EmployeeMaster managerId;
//
//    @ManyToOne
//    @JoinColumn(name = "buHeadId")
//    private EmployeeMaster buHeadId;
    
    @ManyToOne
    @JoinColumn(name = "managerId", referencedColumnName = "employeeId") // Specify the referenced column name
    private EmployeeMaster managerId;

    @ManyToOne
    @JoinColumn(name = "buHeadId", referencedColumnName = "employeeId") // Specify the referenced column name
    private EmployeeMaster buHeadId;

    @Column
    private LocalDateTime joiningDate;

    // Constructors, getters, setters...
}
