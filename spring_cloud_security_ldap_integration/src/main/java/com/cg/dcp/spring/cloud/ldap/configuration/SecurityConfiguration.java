
package com.cg.dcp.spring.cloud.ldap.configuration;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.LdapShaPasswordEncoder;
import org.springframework.security.ldap.DefaultSpringSecurityContextSource;

/**
 * @author mshafina
 * 
 *         This class provides all the required api authentications for any user
 *         who are going to access the api's.
 * 
 */
@SuppressWarnings("deprecation")
@EnableGlobalMethodSecurity(securedEnabled = true)
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	/**
	 * 
	 * This method is authenticating all the incoming request url to the controller
	 * 
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().anyRequest().fullyAuthenticated().and().formLogin();
	}

	/**
	 * 
	 * This method is authenticating the users based on the details that is
	 * maintained in the ldif file, which is present in the resource classpath
	 * 
	 */
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.ldapAuthentication().userDnPatterns("uid={0},ou=people").groupSearchBase("ou=groups")
				.contextSource(contextSource()).passwordCompare().passwordEncoder(new LdapShaPasswordEncoder())
				.passwordAttribute("userPassword");
	}

	/**
	 * @return
	 * 
	 * 
	 * 		This bean is registering the ldap server on the mentioned port
	 * 
	 *         that is ldap://localhost:8389/
	 * 
	 * 
	 */
	@Bean
	public DefaultSpringSecurityContextSource contextSource() {
		return new DefaultSpringSecurityContextSource(Arrays.asList("ldap://localhost:8389/"),
				"dc=springframework,dc=org");
	}

}
