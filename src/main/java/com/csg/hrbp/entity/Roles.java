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
@Table(name = "roles")
@Component
public class Roles {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleId;

    @Column
    private String jobTitle;

    @Column(unique = true)
    private String roleName;

    // Constructors, getters, setters...
}
