package com.example.demo;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CamelTestApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CamelTestApplication.class, args);
	}

}
