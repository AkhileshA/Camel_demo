package com.example.demo;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@RestController("/")
public class Controller {


	@Autowired
	private RestTemplate server;
	
	@GetMapping
	public Quote getReq()
	{
		return server.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
	}
	
	@PostMapping
	public Response postReq(@RequestBody Request req) throws RestClientException, URISyntaxException
	{
		return server.postForObject(new URI("http://localhost:8080"), req, Response.class);
	}
}
