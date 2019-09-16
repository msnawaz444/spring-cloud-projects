package com.cg.dcp.stream.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author mshafina
 * 
 *         This is the main application class, which spring used to launch or
 *         bootstrap the application on the server and also consuming the data
 *         from the rabbitmq exchange
 *
 */
@EnableBinding(Sink.class)
@SpringBootApplication
public class SpringCloudStreamConsumerApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringCloudStreamConsumerApplication.class);

	/**
	 * 
	 * 
	 * @param args
	 * 
	 * 
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamConsumerApplication.class, args);
	}

	/**
	 * 
	 * 
	 * @param employee
	 * 
	 *                 This method is creating a real time connection with the
	 *                 rabbitmq exchange and getting the point in time data from
	 *                 exchange.
	 * 
	 */
	@StreamListener(target = Sink.INPUT)
	public void processRegisterEmployees(String employee) {
		LOGGER.info("Employees Registered by Client %s", employee);
	}

}
