package com.example.demo;

import java.util.Map;

public class Response {

	public Response(int a, int b, String c, Map<Integer, String> map) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.map = map;
	}
	public Response() {
		
	}
	private int a;
	private int b;
	private String c;
	Map<Integer,String> map;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	
}
