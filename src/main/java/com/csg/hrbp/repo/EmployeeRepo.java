package com.csg.hrbp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csg.hrbp.entity.EmployeeMaster;
@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeMaster, Integer> {

}
