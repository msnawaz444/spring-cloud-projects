package com.cg.dcp.cloud.stream.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author mshafina
 * 
 *         This configuration class for swagger in this class swagger api is
 *         providing a documentation for all the controller api's.
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	/**
	 * @return
	 * 
	 * 		This bean is utilizing the swagger configuration for converting the
	 *         controller api's into well documented form
	 */
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build().pathMapping("/");
	}
}
