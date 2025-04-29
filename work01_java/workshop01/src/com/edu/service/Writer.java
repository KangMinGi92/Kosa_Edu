package com.edu.service;

public class Writer {
	public String name;
	public String id;
	
	//값주입
	public void setWriterInfo(String name, String id) {
		this.name=name;
		this.id=id;
	}
	//값 받아옴
	public String getWriterInfo() {
		return name+","+id;
	}
	public String getWriterName() {
		return name;
	}
}
