package com.cg.dcp.contract;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * @author mshafina
 * 
 *         This is the service class which handles all the service related
 *         function.
 * 
 * 
 */
@Service
class PersonService {

	private final Map<Long, Person> personMap;

	/**
	 * 
	 * This constructor is loading all the predefined persons into the map which is
	 * working as temporary database.
	 * 
	 * 
	 */
	public PersonService() {
		personMap = new HashMap<>();
		personMap.put(1L, new Person(1L, "Richard", "Gere"));
		personMap.put(2L, new Person(2L, "Emma", "Choplin"));
		personMap.put(3L, new Person(3L, "Anna", "Carolina"));
	}

	/**
	 * 
	 * @param id
	 * @return
	 * 
	 *         This methods returns the person based on provided id.
	 */
	Person findPersonById(Long id) {
		return personMap.get(id);
	}
}