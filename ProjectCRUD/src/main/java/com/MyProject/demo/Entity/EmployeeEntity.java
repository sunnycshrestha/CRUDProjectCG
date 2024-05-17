package com.MyProject.demo.Entity;

import java.sql.Date;
import java.time.LocalDate;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE_IN")

public class EmployeeEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLOYEE_ID")
    int EMPLOYEE_ID;

    @NotNull
    @Column(name = "F_NAME")
    String F_NAME;

    @NotNull
    @Column(name = "L_NAME")
    String L_NAME;

    @NotNull
    @Column(name = "DOB")
    LocalDate DOB;

    @NotNull
    @Column(name = "SSN", length = 4, unique = true)
    String SSN;

    public EmployeeEntity(int eMPLOYEE_ID, String f_NAME, String l_NAME, LocalDate dob, String sSN) {
        EMPLOYEE_ID = eMPLOYEE_ID;
        F_NAME = f_NAME;
        L_NAME = l_NAME;
        DOB = dob;
        SSN = sSN;
    }

    public EmployeeEntity() {

        // TODO Auto-generated constructor stub
    }


}
