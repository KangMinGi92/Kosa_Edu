package com.edu.constructor;
//NoteBook을 사용하는 개발자
public class Programmer {
	//생성자주입
	String name;
	String mainSkill;
	double salary;
	int bonus;
	
	//setter주입
	NoteBook noteBook;
	
	public Programmer(){}
	public Programmer(String name,String mainSkill,double salary,int bonus) {
		this.name=name;
		this.mainSkill=mainSkill;
		this.salary=salary;
		this.bonus=bonus;
	}
	public void buyNoteBook(NoteBook noteBook) {
		this.noteBook=noteBook;
	}
	public NoteBook getNoteBook() {
		return noteBook;
	}
	public String getProgrammerInfo() {
		return name+"\t"+salary+"\t"+mainSkill;
	}
	
	//기능 추가
	//개발자의 연봉을 반환하는 기능을 정의... 
	public double getAnnualSalary() {
		return (salary*12) + bonus;
	}
	//개발자의 급여를 기존보다 (50)만원 더 인상하는 기능을 정의...
	public void raiseSalary(int amount) {
		salary+=amount;
	}
}
