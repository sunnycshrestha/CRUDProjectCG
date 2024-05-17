package com.MyProject.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.MyProject.demo.Entity.EmployeeEntity;
import com.MyProject.demo.Service.EmployeeService;

@RestController

public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getEmployee")
    public List<EmployeeEntity> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable int id) {
        EmployeeEntity employeeEntity = employeeService.getEmployeeById(id);
        return ResponseEntity.ok().body(employeeEntity);
    }

    @PostMapping("/createEmployee/{id}")
    public ResponseEntity<EmployeeEntity> createEmployee(@RequestBody EmployeeEntity employeeEntity) {
        EmployeeEntity employeeEntity1 = employeeService.createEmployee(employeeEntity);
        return ResponseEntity.ok().body(employeeEntity1);
    }

    @PutMapping("/updateEmployee/{id}")
    public ResponseEntity<EmployeeEntity> updateEmployee(@PathVariable int id, @RequestBody EmployeeEntity employeeInfo) {
        EmployeeEntity newEmployee = employeeService.updateEmployee(id, employeeInfo);
        if (newEmployee != null) {
            return ResponseEntity.ok().body(newEmployee);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }

}



