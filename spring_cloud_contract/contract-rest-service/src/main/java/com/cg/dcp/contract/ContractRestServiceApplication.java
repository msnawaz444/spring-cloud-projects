package com.cg.dcp.contract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mshafina
 * 
 *         This is the main class, which spring uses to bootstrap the
 *         application on the defined port.
 *
 */
@SpringBootApplication
public class ContractRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContractRestServiceApplication.class, args);
	}

}
