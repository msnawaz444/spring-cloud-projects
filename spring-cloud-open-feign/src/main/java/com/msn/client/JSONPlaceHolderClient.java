package com.msn.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.msn.config.ClientConfiguration;
import com.msn.hystrix.JSONPlaceHolderFallback;
import com.msn.model.Post;

@FeignClient(value = "jplaceholder", url = "http://jsonplaceholder.typicode.com/", configuration = ClientConfiguration.class, fallback = JSONPlaceHolderFallback.class)
public interface JSONPlaceHolderClient {

	@GetMapping("/posts")
	List<Post> getPosts();

	@GetMapping("/posts/{postId}")
	Post getPostById(@PathVariable("postId") Long postId);
}
