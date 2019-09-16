package com.cg.dcp.cloud.stream.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author mshafina
 *
 *         This is an entity class named employee
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {

	private String empName;
	private String empID;

	/**
	 * @return employee name
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName
	 * 
	 *                set employee name
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return employee id
	 */
	public String getEmpID() {
		return empID;
	}

	/**
	 * @param empID
	 * 
	 *              set employee id
	 */
	public void setEmpID(String empID) {
		this.empID = empID;
	}

	/**
	 * 
	 * This is returning the to string representation of employee entity
	 * 
	 */
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empID=" + empID + "]";
	}

}
