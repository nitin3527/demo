package com.junit.demo.dao.impl;

import com.junit.demo.entities.Employee;
import com.junit.demo.dao.EmployeeRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public Employee findByEmailIgnoreCase(String email) {
        return null;
    }
}
