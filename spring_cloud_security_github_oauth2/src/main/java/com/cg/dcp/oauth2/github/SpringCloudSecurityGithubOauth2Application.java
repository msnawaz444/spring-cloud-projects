package com.cg.dcp.oauth2.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mshafina
 * 
 *         Oauth2 SSO with github Authentication
 * 
 *         This application authenticates and verify the users by github users
 *         credentials, and after authentication from spring security the
 *         clients are authorize to access the application
 *
 */
@SpringBootApplication
public class SpringCloudSecurityGithubOauth2Application {

	/**
	 * @param args
	 * 
	 *             this is main method from where the application will bootstrap.
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSecurityGithubOauth2Application.class, args);
	}

}
