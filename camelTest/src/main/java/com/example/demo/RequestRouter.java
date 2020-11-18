package com.example.demo;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;

import feign.Request.HttpMethod;

public class RequestRouter extends RouteBuilder {

	public static JacksonDataFormat jsonDataFormat = new JacksonDataFormat(Response.class);
	@Override
	public void configure() throws Exception {
		
		from("direct:get").setHeader(Exchange.HTTP_METHOD,constant(HttpMethod.GET)).to("http://localhost:8080");
		from("http://localhost:8080").unmarshal().json(JsonLibrary.Jackson,Response.class).to("bean:com.example.demo.Response").process(new Myprocessor());
		
	}

}
