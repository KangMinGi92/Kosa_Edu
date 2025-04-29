package com.edu.oop.test;

import com.edu.oop.NoteBook;

public class NoteBookTest {

	public static void main(String[] args) {
		NoteBook nb = new NoteBook();
		//Filed Initialization
		nb.serialNumber = 1;
		nb.brand = "lg";
		nb.price = 1000000.5;
		
		//Method Call
		nb.printNoteBookInfo();

	}

}
