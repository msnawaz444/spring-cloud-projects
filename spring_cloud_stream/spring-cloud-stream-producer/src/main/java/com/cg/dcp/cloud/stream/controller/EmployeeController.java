package com.cg.dcp.cloud.stream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dcp.cloud.stream.model.Employee;
import com.cg.dcp.cloud.stream.source.EmployeeRegistration;

/**
 * @author mshafina
 * 
 *         This is a controller entity which are having all the api's for
 *         request handling in application
 */
@RestController
@EnableBinding(EmployeeRegistration.class)
public class EmployeeController {

	@Autowired
	EmployeeRegistration employeeRegistration;

	/**
	 * @param employee
	 * @return
	 * 
	 * 		POST/register
	 * 
	 *         This method is sending message to the rabbitmq exchange using spring
	 *         cloud stream configuration from yml file.
	 */
	@PostMapping("/register")
	public String register(@RequestBody Employee employee) {
		employeeRegistration.employeeRegistration().send(MessageBuilder.withPayload(employee).build());
		return "Employee Registered";
	}
}
