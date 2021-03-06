package com.example.demo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.PollingConsumer;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController("/")
public class Controller {

	@Autowired
	public Client cl;
	
	@Autowired
	ProducerTemplate template;
	
	@Autowired
	ConsumerTemplate consumer;
	
	
	@GetMapping
	public Response getReq() throws Exception
	{				
		template.asyncSendBody("direct:abcd",null);
		Exchange exchange = consumer.receive("direct:end",10000);
		
		Response resp = exchange.getIn().getBody(Response.class);
		
//------------------------------------------------------------------------------------------
//		CompletableFuture<Response> response = template.asyncRequestBody("seda:abcd", null,Response.class);
//		Response resp = response.get();\
		
		
		System.out.println("message 1 " + resp);		
		return resp; 
	}
	
	@PostMapping
	public Response post(@RequestBody Request req)
	{
		return cl.post(req);
	}
}
	