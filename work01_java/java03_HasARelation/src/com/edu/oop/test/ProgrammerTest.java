package com.edu.oop.test;

import com.edu.oop.NoteBook;
import com.edu.oop.Programmer;
//객체생성의 원리
//class는 여러가지 서로다른 객체를 생성할때 Type으로 사용된다.
//ex)class Shirt{
//		String brand;
//		int size;
//		boolean longSleeved;
//	}
//	Shirt longT = new Shirt();
//	Shirt shortT = new Shirt();
public class ProgrammerTest {

	public static void main(String[] args) {
		//1.NoteBook,Programmer class를 생성한다.
		//2.NoteBook,Programmer class의 setmethod를 이용하여 NoteBook,Programmer 정보값을 대입한다.
		//3.NoteBook,Programmer class의 getmethod를 이용하여 출력한다.
		
		NoteBook noteBook=new NoteBook();
		Programmer programmer=new Programmer();
		programmer.setProgrammer("James", "java", 3000000);
		noteBook.setNoteBook(123, "hp", 120);
		programmer.useNoteBook(noteBook);
		System.out.println(noteBook.getNoteBook());
		System.out.println(programmer.getProgrammer()+programmer.getNoteBook().getNoteBook());
	}

}
