package com.cg.dcp.contract;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mshafina
 *
 *         This is the controller class, which use to handle all the api calls
 *         made to the application
 */
@RestController
class PersonController {

	private final PersonService personService;

	/**
	 * @param personService
	 */
	public PersonController(PersonService personService) {
		this.personService = personService;
	}

	/**
	 * @param id
	 * @return
	 * 
	 *         GET/person/{id}
	 * 
	 *         This function used to find the persons details based on the provided
	 *         id.
	 */
	@GetMapping("/person/{id}")
	public Person findPersonById(@PathVariable("id") Long id) {
		return personService.findPersonById(id);
	}
}