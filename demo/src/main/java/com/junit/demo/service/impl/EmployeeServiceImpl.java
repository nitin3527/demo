package com.junit.demo.service.impl;

import com.junit.demo.dao.EmployeeRepository;

import com.junit.demo.entities.Employee;
import com.junit.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

//    @Value("${security.key}")
//    private String securityKey;

    public void createEmployee(){
        //some code
    }

    public void updateNameOfEmployee(String email, String firstName){
       // Employee employee = employeeRepository.findAllByEmailIgnoreCase(email);

    }

    public static String employeStaticMethod(String msg){
        return msg;
    }

    public String getEmployeId(String email){
        Employee employee = employeeRepository.findByEmailIgnoreCase(email);
        return employee.getId();
    }

//    public String getSecurityKey() {
//        return securityKey;
//    }


}
