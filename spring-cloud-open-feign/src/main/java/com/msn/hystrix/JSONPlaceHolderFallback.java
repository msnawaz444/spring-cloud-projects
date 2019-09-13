package com.msn.hystrix;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.msn.client.JSONPlaceHolderClient;
import com.msn.model.Post;

@Component
public class JSONPlaceHolderFallback implements JSONPlaceHolderClient {

	@Override
	public List<Post> getPosts() {
		return Collections.emptyList();
	}

	@Override
	public Post getPostById(Long postId) {
		return null;
	}

}
