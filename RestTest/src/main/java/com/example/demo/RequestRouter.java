package com.example.demo;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import feign.Request.HttpMethod;

@Component
public class RequestRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		JacksonDataFormat jsonDataFormat = new JacksonDataFormat(Response.class);
		
		from("direct:abcd")
			.setHeader(Exchange.HTTP_METHOD, simple("GET"))
			.to("ahc:http://localhost:8080").unmarshal(jsonDataFormat).to("direct:end");
				
	}
}
