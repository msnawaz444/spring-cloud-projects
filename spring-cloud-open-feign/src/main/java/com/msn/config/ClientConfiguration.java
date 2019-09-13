package com.msn.config;

import org.apache.http.entity.ContentType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;
import feign.okhttp.OkHttpClient;

@Configuration
public class ClientConfiguration {

	@Bean
	public OkHttpClient client() {
		return new OkHttpClient();
	}

	@Bean
	public RequestInterceptor requestInterceptor() {
		return requestTemplate -> {
			requestTemplate.header("user", "nawaz");
			requestTemplate.header("password", "12345");
			requestTemplate.header("Accept", ContentType.APPLICATION_JSON.getMimeType());
		};
	}
}
