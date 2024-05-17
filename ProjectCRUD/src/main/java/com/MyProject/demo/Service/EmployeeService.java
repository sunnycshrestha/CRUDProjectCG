package com.MyProject.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyProject.demo.Entity.EmployeeEntity;
import com.MyProject.demo.Repository.EmployeeRepository;

@Service

public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeEntity> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public EmployeeEntity getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    public EmployeeEntity updateEmployee(int id, EmployeeEntity employeeInfo) {
        EmployeeEntity employeeEntity = employeeRepository.findById(id).orElse(null);
        if (employeeEntity != null) {
            employeeEntity.setF_NAME(employeeInfo.getF_NAME());
            employeeEntity.setL_NAME(employeeInfo.getL_NAME());
            employeeEntity.setDOB(employeeInfo.getDOB());
            employeeEntity.setSSN(employeeInfo.getSSN());
            return employeeRepository.save(employeeEntity);
        }
        return null;
    }

    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

}


