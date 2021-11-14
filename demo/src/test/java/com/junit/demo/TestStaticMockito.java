package com.junit.demo;

import com.junit.demo.entities.Employee;
import com.junit.demo.service.impl.EmployeeServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.ArgumentMatchers.anyString;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Employee.class)
@PowerMockIgnore({"com.sun.org.apache.xerces.*", "javax.xml.*", "org.xml.*", "javax.management.*"})
public class TestStaticMockito {

    @InjectMocks
    EmployeeServiceImpl employeeService;

//    @Mock
//    EmployeeRepository employeeRepository;

    @Test
    public void testEmployeeService(){
//        mockStatic(EmployeeService.class);
//        when(EmployeeService.EmployeeService(anyString())).thenReturn("Testing static method");
        String response;
        response = EmployeeServiceImpl.employeStaticMethod(anyString());
        Assert.assertEquals("Testing static method",response);
    }
}
