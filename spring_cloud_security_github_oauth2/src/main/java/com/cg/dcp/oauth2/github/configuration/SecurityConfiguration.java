package com.cg.dcp.oauth2.github.configuration;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author mshafina
 * 
 *         This entity providing the configuration to spring security and
 *         allowing access to only authorized client or users
 */
@EnableOAuth2Sso
@Order(Ordered.HIGHEST_PRECEDENCE)
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	/**
	 * This functions provides real configuration to the spring security and helps
	 * to authorize and authenticate the api request.
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/").permitAll().anyRequest().authenticated();
	}
}
