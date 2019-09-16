package com.cg.dcp.contract;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author mshafina
 * 
 *         This is the controller api class which handles all the api request
 *         made to the applications
 *
 */
@RestController
class MessageRestController {

	private final RestTemplate restTemplate;

	/**
	 * @param restTemplateBuilder
	 */
	MessageRestController(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

	/**
	 * @param personId
	 * @return
	 * 
	 *         This method is getting the data from the client at run time using
	 *         rest template.
	 * 
	 */
	@GetMapping("/message/{personId}")
	String getMessage(@PathVariable("personId") Long personId) {
		Person person = this.restTemplate.getForObject("http://localhost:8000/person/{personId}", Person.class,
				personId);
		return "Hello " + person.getName();
	}

}