package com.cg.dcp.oauth2.github.service;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cg.dcp.oauth2.github.controller.EmployeeController;
import com.cg.dcp.oauth2.github.model.Employee;
import com.cg.dcp.oauth2.github.service.EmployeeService;

/**
 * @author mshafina
 * 
 *         The class <code>EmployeeServiceTest</code> contains tests for the
 *         class <code>{@link EmployeeService}</code>.
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceTest {

	Map<Integer, Employee> empMap = new HashMap<>();

	@InjectMocks
	EmployeeService empService;

	/**
	 * 
	 * 
	 * Run the getEmployee method test
	 * 
	 * 
	 */
	@Test
	public void testGetEmployee() {
		empMap.put(123, new Employee(123, "ram", 25, "ap"));
		empMap.put(122, new Employee(122, "sita", 27, "tn"));
		empMap.put(124, new Employee(124, "raju", 38, "kl"));
		Collection<Employee> empExpexted = empMap.values();
		Collection<Employee> emps = empService.getEmployee();
		assertEquals(empExpexted.toString(), emps.toString());
	}

	/**
	 * 
	 * 
	 * Run the saveEmployee method test
	 * 
	 * 
	 */
	@Test
	public void testSaveEmployee() {
		empMap.put(111, new Employee(111, "bala", 45, "tn"));
		Collection<Employee> empExpexted = empMap.values();
		Collection<Employee> emps = empService.saveEmployee(111);
		assertEquals(empExpexted.toString(), emps.toString());
	}

}
