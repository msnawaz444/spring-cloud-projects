package com.cg.dcp.oauth2.github.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dcp.oauth2.github.model.Employee;
import com.cg.dcp.oauth2.github.service.EmployeeService;

/**
 * @author mshafina
 * 
 *         controller entity with rest api's
 *
 */
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@Autowired
	OAuth2ClientContext clientContext;

	Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

	/**
	 * @return
	 * 
	 * 		GET/ACCESS TOKEN
	 * 
	 *         this method is to get oauth2 token from github for the respective
	 *         logged in user.
	 */
	@GetMapping("/acc_token")
	public String getToken() {
		LOGGER.info("oauth2 token :: " + clientContext.getAccessToken().getValue());
		return clientContext.getAccessToken().getValue();
	}

	/**
	 * @return
	 * 
	 * 		GET/EMP
	 * 
	 *         this method is to get all the employee details
	 */
	@GetMapping("/emp")
	public Collection<Employee> getEmployee() {
		return empService.getEmployee();

	}

	/**
	 * @param empId
	 * @return
	 * 
	 * 		GET/EMP/{EMPID}
	 * 
	 *         this method is to add the new employee based on the given empId
	 */
	@GetMapping("/emp/{empId}")
	public Collection<Employee> saveEmployee(@PathVariable Integer empId) {
		return empService.saveEmployee(empId);
	}

}
