package com.cg.dcp.contract;

class Person {

	private Long id;
	private String name;
	private String surname;

	/**
	 * 
	 */
	public Person() {

	}

	/**
	 * @param id
	 * @param name
	 * @param surname
	 */
	Person(Long id, String name, String surname) {
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	/**
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return name
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
}