package com.junit.demo;

import com.junit.demo.dao.EmployeeRepository;
import com.junit.demo.entities.Employee;
import com.junit.demo.service.impl.EmployeeServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.junit.demo.commonUtils.commonUtils.mockEmployeObject;
import static org.mockito.ArgumentMatchers.anyString;

//@PrepareForTest(EmployeeServiceImpl.class)
//@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@InjectMocks
	EmployeeServiceImpl employeeService;

	@Mock
	EmployeeRepository employeeRepository;

	@Test
	void loadContext(){

	}

	@Test
	void testGetEmployeId(){
		Employee employee = mockEmployeObject();
		Mockito.when(employeeRepository.findByEmailIgnoreCase(anyString())).thenReturn(employee);
		Assert.assertEquals("55",employeeService.getEmployeId("employee@gmail.com"));
	}


}
