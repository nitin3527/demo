package com.junit.demo.commonUtils;

import com.junit.demo.entities.Employee;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class commonUtils {
    public static Employee mockEmployeObject() {
        Employee employee = mock(Employee.class);
        doReturn("employee@gmail.com").when(employee).getEmail();
        doReturn("55").when(employee).getId();
        doReturn("employee").when(employee).getFirstName();
        doReturn("ttn").when(employee).getLastName();
        return employee;
    }
}
