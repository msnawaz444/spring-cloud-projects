package com.cg.dcp.spring.cloud.ldap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mshafina
 *
 *
 *         This is the controller class which handles all the api's related
 *         request.
 *
 *
 */
@RestController
public class ResourceController {

	/**
	 * @return
	 * 
	 * 
	 * 		GET /check --> simply returns a response telling your application is
	 *         working fine. only after the user is validated from the ldap server.
	 * 
	 * 
	 */
	@GetMapping("/check")
	public String check() {
		return "You are Authenticated, Now You can access apis";
	}

}
