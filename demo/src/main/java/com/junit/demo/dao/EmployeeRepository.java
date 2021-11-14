package com.junit.demo.dao;

import com.junit.demo.entities.Employee;
//import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepository {
    Employee findByEmailIgnoreCase(String email);
}
