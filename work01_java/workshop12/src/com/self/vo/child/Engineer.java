package com.self.vo.child;

import com.self.util.MyDate;
import com.self.vo.parent.Employee;

public class Engineer extends Employee {
	private String tech;
	private int bonus;

	public Engineer(int empno, String name, int salary, int annualLeave, MyDate myDate, String tech, int bonus) {
		super(empno, name, salary, annualLeave, myDate);
		this.tech = tech;
		this.bonus = bonus;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return super.toString()+"tech= " + tech + ", bonus=" + bonus;
	}
	
	
}
