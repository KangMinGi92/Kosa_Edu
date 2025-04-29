package com.edu.oop;

public class NoteBook {
	//field 선언
	public int serialNumber;
	public String brand;
	public double price;
	
	//method 정의
	public void printNoteBookInfo() {
		System.out.println(serialNumber+" , "+brand+" , "+ price);	
	}
}