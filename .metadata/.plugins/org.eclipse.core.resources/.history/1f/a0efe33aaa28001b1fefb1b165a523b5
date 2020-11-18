package com.example.demo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class Myprocessor implements Processor {

    public void process(Exchange exchange) throws Exception { 
    	System.out.println("here" + exchange);
    	String str = exchange.getIn().getBody(String.class);
        System.out.println(exchange.getIn().getBody(String.class));
    }
}