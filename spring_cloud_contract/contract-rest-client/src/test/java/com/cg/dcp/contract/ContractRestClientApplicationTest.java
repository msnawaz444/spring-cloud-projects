package com.cg.dcp.contract;

import org.assertj.core.api.BDDAssertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.junit.StubRunnerRule;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.cg.dcp.contract.Person;

/**
 * @author mshafina
 * 
 *         This is the main class for all the test cases
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ContractRestClientApplicationTest {

	/**
	 * This stub runner will get the stub jars from the service at run time
	 */
	@Rule
	public StubRunnerRule stubRunnerRule = new StubRunnerRule()
			.downloadStub("com.cg.dcp", "contract-rest-service", "0.0.1-SNAPSHOT", "stubs").withPort(8100)
			.stubsMode(StubRunnerProperties.StubsMode.LOCAL);

	/**
	 * This methods run the test based on contract mentioned at the service side by
	 * accessing the stub jar at run time created by the service. If contract will
	 * be followed between the service and client then this case will pass.
	 */
	@Test
	public void testGetPersonFromServiceContract() {
		// given:
		RestTemplate restTemplate = new RestTemplate();

		// when:
		ResponseEntity<Person> personResponseEntity = restTemplate.getForEntity("http://localhost:8100/person/1",
				Person.class);

		// then:
		BDDAssertions.then(personResponseEntity.getStatusCodeValue()).isEqualTo(200);
		BDDAssertions.then(personResponseEntity.getBody().getId()).isEqualTo(1l);
		BDDAssertions.then(personResponseEntity.getBody().getName()).isEqualTo("foo");
		BDDAssertions.then(personResponseEntity.getBody().getSurname()).isEqualTo("bee");

	}
}