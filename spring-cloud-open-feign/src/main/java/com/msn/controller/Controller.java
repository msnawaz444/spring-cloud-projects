package com.msn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.msn.client.JSONPlaceHolderClient;
import com.msn.model.Post;

@RestController
public class Controller {

	@Autowired
	JSONPlaceHolderClient jsonPlaceHolderClient;

	@GetMapping("/posts")
	List<Post> getPosts() {
		return jsonPlaceHolderClient.getPosts();
	}

	@GetMapping("/posts/{postId}")
	Post getPostById(@PathVariable("postId") Long postId) {
		return jsonPlaceHolderClient.getPostById(postId);
	}

}
