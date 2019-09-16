package com.cg.dcp.oauth2.github.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cg.dcp.oauth2.github.controller.EmployeeController;
import com.cg.dcp.oauth2.github.model.Employee;
import com.cg.dcp.oauth2.github.service.EmployeeService;

/**
 * @author mshafina
 * 
 *
 *         The class <code>EmployeeControllerTest</code> contains tests for the
 *         class <code>{@link EmployeeController}</code>.
 *
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeControllerTest {

	Map<Integer, Employee> empMap = new HashMap<>();

	@InjectMocks
	EmployeeController empRestControllerTest;

	@Mock
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
		Collection<Employee> emps = empMap.values();
		when(empService.getEmployee()).thenReturn(emps);
		assertEquals(emps, empRestControllerTest.getEmployee());
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
		empMap.put(444, new Employee(444, "bala", 45, "tn"));
		Collection<Employee> emps = empMap.values();
		when(empService.saveEmployee(444)).thenReturn(emps);
		assertEquals(emps, empRestControllerTest.saveEmployee(444));
	}

}
