package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Request {
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
}