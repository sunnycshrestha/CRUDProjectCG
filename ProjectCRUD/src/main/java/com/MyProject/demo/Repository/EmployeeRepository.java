package com.MyProject.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MyProject.demo.Entity.EmployeeEntity;
@Repository

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer > {

}
