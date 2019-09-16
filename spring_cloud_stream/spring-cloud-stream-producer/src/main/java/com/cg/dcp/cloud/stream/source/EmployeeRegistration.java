package com.cg.dcp.cloud.stream.source;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author mshafina
 *
 *
 *         This is an interface which is actually creating an exchange in the
 *         rabbitmq server with the name that is passed in the @Output
 *         annotation
 */
@FunctionalInterface
public interface EmployeeRegistration {

	@Output("employeeRegistrationChannel")
	MessageChannel employeeRegistration();

}
