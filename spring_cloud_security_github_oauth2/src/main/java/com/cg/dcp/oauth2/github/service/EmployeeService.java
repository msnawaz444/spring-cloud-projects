package com.cg.dcp.oauth2.github.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.cg.dcp.oauth2.github.model.Employee;

/**
 * @author mshafina
 * 
 *         this entity is providing services with the databases for
 */
@Service
public class EmployeeService {

	Map<Integer, Employee> empMap = new HashMap<>();

	/**
	 * @return
	 * 
	 * 		this method is to get the details of employees
	 */
	public Collection<Employee> getEmployee() {
		if (ObjectUtils.isEmpty(empMap)) {
			empMap.put(123, new Employee(123, "ram", 25, "ap"));
			empMap.put(122, new Employee(122, "sita", 27, "tn"));
			empMap.put(124, new Employee(124, "raju", 38, "kl"));
		}
		return empMap.values();
	}

	/**
	 * @param empId
	 * @return
	 * 
	 * 		this method is to save the new employee
	 */
	public Collection<Employee> saveEmployee(Integer empId) {
		empMap.put(empId, new Employee(empId, "bala", 45, "tn"));
		return empMap.values();
	}
}
