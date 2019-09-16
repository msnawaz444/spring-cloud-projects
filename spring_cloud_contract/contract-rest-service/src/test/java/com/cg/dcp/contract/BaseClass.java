package com.cg.dcp.contract;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.dcp.contract.ContractRestServiceApplication;
import com.cg.dcp.contract.Person;
import com.cg.dcp.contract.PersonController;
import com.cg.dcp.contract.PersonService;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

/**
 * @author mshafina
 * 
 *         This is the base class, using this class only spring creates stub jar
 *         by complying the contract.
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ContractRestServiceApplication.class)
public abstract class BaseClass {

	@Autowired
	PersonController personRestController;

	@MockBean
	PersonService personService;

	/**
	 * this is set up method.
	 */
	@Before
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(personRestController);
		Mockito.when(personService.findPersonById(1L)).thenReturn(new Person(1L, "foo", "bee"));
	}

}