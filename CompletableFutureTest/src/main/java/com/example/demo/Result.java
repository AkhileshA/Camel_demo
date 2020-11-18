package com.example.demo;

public class Result {
	public Result() {
		super();
	}
	public Result(ApiResponse1 response1, Quote response2) {
		super();
		this.response1 = response1;
		this.response2 = response2;
	}
	private ApiResponse1 response1;
	private Quote response2;
	public ApiResponse1 getResponse1() {
		return response1;
	}
	public void setResponse1(ApiResponse1 response1) {
		this.response1 = response1;
	}
	public Quote getResponse2() {
		return response2;
	}
	public void setResponse2(Quote response2) {
		this.response2 = response2;
	}
	@Override
	public String toString() {
		return "Result [response1=" + response1 + ", response2=" + response2 + "]";
	}
}
