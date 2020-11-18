package com.example.demo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController("/")
public class Controller {

	@Autowired
	private RestTemplate client;
	
	@GetMapping
	public Result get() throws InterruptedException, ExecutionException {
//		CompletableFuture<Quote> future1 = CompletableFuture.supplyAsync(
//				()-> {
//					try {
//						Thread.sleep(4000);
//						System.out.println("just before api 1 call");
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					return client.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
//					});
//		CompletableFuture<ApiResponse1> future2 = CompletableFuture.supplyAsync(
//				()-> client.getForObject("http://localhost:8080", ApiResponse1.class));
//		System.out.println("before get");
//		Thread.sleep(10000);
		CompletableFuture<Quote> res = CompletableFuture.supplyAsync(() -> 
			 client.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class));
		
		CompletableFuture<ApiResponse1> res2 = CompletableFuture.supplyAsync(
				() -> client.getForObject("http://localhost:8080", ApiResponse1.class));
	

		
		System.out.println("sleeping");
		Thread.sleep(5000);
		System.out.println("done Sleeping");
		
		CompletableFuture<Void> combinedFuture 
		  = CompletableFuture.allOf(res, res2);
		combinedFuture.get();
		
		System.out.println("message 1 " + res.get());
		System.out.println("message 2 " + res2.get());
		
		return new Result(res2.get(),res.get());
	}
}
