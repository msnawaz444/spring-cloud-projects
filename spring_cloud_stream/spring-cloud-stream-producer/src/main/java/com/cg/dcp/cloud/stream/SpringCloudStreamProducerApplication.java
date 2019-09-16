package com.cg.dcp.cloud.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mshafina
 * 
 *         This is the main application class, which spring used to launch or
 *         bootstrap the application on the server
 *
 */
@SpringBootApplication
public class SpringCloudStreamProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamProducerApplication.class, args);
	}

}
