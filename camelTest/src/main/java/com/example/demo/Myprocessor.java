package com.example.demo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class Myprocessor implements Processor {

    public void process(Exchange exchange) throws Exception {
    	System.out.println( "here");
        System.out.println(exchange.getIn().getBody(String.class));
    }
}