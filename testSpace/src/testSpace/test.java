package testSpace;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class test {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		CompletableFuture<String> completableFuture 
		  = CompletableFuture.supplyAsync(() -> "Hello")
		    .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + " World"));
		System.out.println(completableFuture.get());
	}

}
