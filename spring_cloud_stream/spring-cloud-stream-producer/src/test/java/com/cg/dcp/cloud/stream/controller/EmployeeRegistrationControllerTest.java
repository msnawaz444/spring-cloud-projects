package com.cg.dcp.cloud.stream.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cg.dcp.cloud.stream.model.Employee;
import com.cg.dcp.cloud.stream.source.EmployeeRegistration;

/**
 * @author mshafina
 *
 *         This is EmployeeRegistrationControllerTest for testing the
 *         functionality of EmployeeRegistrationController class
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeRegistrationControllerTest {

	@InjectMocks
	EmployeeController employeeController;

	@Mock
	EmployeeRegistration employeeRegistration;
	
	@Mock
	MessageChannel messageChannel;
	
	@SuppressWarnings("rawtypes")
	@Mock
	Message message;

	/**
	 * 
	 * This test run the register method
	 * 
	 */
	@Test
	public void testRegister() {
		String expected = "Employee Registered";
		Employee employee = new Employee();
		employee.setEmpID("123");
		employee.setEmpName("karan");
		when(employeeRegistration.employeeRegistration()).thenReturn(messageChannel);
		when(messageChannel.send(message)).thenReturn(true);
		assertEquals(expected, employeeController.register(employee));

	}
}
