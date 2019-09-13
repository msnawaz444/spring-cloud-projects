package com.msn.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.msn.model.User;

@RestController
public class UserController {

	@Autowired
	private RestTemplate restTemplate;

	private final String URL = "http://jsonplaceholder.typicode.com/todos/";

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") int id) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		User user = restTemplate.getForObject(URL + id, User.class);
		return user;
	}

	@PostMapping("/post")
	public ResponseEntity<String> postUser(@RequestBody User user) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<User> entity = new HttpEntity<>(headers);
		User user2 = restTemplate.postForObject(URL, entity, User.class);
		return new ResponseEntity<>("Post successfully added: " + user2.toString(), HttpStatus.OK);

	}

}
