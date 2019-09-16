package com.cg.dcp.spring.cloud.ldap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mshafina
 * 
 *
 *         This is a main class, the spring application will bootstrap from this
 *         class only.
 * 
 * 
 */
@SpringBootApplication
public class SpringCloudSecurityLdapIntegrationApplication {

	/**
	 * 
	 * @param args
	 * 
	 * 
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSecurityLdapIntegrationApplication.class, args);
	}

}
