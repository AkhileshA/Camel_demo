package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import feign.Param;

@FeignClient(name = "test", url = "http://localhost:8080")
public interface Client {
	@RequestMapping(method = RequestMethod.GET )
	public Response req();
	
	@RequestMapping(method = RequestMethod.POST)
	public Response post(@RequestBody Request req);
}

