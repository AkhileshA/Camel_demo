package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class TestController {

	@GetMapping
	public ResponseEntity<Response> postResponse() throws InterruptedException {

		Map<Integer,String> map = new HashMap<>();
		map.put(1, "one");
		Response response = new Response(1,2,"test",map);
		System.out.println(response);
		Thread.sleep(10000);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	
	@PostMapping
	public Response postReq(@RequestBody Request req) {
		
 		Map<Integer,String> map = new HashMap<>();
		map.put(1, "one");
		Response response = new Response(1,5,req.getStr(),map);
		return response;
	}
	@GetMapping("/getConfig")
	public String config()
	{
		return "true";
	}
}
