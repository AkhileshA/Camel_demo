package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Request {
	private int id;
	private String str;
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
}