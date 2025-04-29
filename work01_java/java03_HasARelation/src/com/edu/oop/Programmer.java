package com.edu.oop;

// NoteBook을 사용하는 Programmer
public class Programmer {
	
	public String name;
	public String mainSkill;
	public int salary;
	
	//Has a Relation
	
	public NoteBook noteBook;
	
	//주입의 통로1
	public void setProgrammer(String name, String mainSkill,int salary) {
		this.name=name;
		this.mainSkill=mainSkill;
		this.salary=salary;
				
	}
	//주입의 통로2
	public void useNoteBook(NoteBook noteBook) {
		this.noteBook=noteBook;
	}
	
	public String getProgrammer() {
		return name+" "+mainSkill+" "+salary;
	}
	
	public NoteBook getNoteBook() {
		return noteBook;
	}
}
