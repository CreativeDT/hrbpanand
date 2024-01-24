package com.csg.hrbp.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Component
@Table(name = "departments")
public class Departments {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departmentId;

    @Column(unique = true)
    private String departmentName;

    // Constructors, getters, setters...
}
