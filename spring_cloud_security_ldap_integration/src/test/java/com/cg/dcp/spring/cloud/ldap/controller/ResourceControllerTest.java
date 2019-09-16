package com.cg.dcp.spring.cloud.ldap.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cg.dcp.spring.cloud.ldap.controller.ResourceController;

/**
 * @author mshafina
 * 
 *         The class <code>ResourceControllerTest</code> contains tests for the
 *         class <code>{@link ResourceController}</code>.
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class ResourceControllerTest {

	@InjectMocks
	ResourceController helloResource;

	/**
	 * 
	 * Run the check method test
	 * 
	 */
	@Test
	public void testCheck() {
		String expectedResult = "You are Authenticated, Now You can access apis";
		assertEquals(expectedResult, helloResource.check());
	}

}
