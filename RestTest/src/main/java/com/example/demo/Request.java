	package com.example.demo;


public class Request {
	public Request() {
		super();
	}
	public Request(int id, String str) {
		super();
		this.id = id;
		this.str = str;
	}
	private int id;
	private String str;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return "Request [id=" + id + ", str=" + str + "]";
	}
}