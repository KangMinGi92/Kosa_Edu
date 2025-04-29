package com.self.vo.child;

import com.self.util.MyDate;
import com.self.vo.parent.Employee;

public class Designer extends Employee {
	private String skill;
	private String designArea;

	public Designer(int empno, String name, int salary, int annualLeave, MyDate myDate, String skill,
			String designArea) {
		super(empno, name, salary, annualLeave, myDate);
		this.skill = skill;
		this.designArea = designArea;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getDesignArea() {
		return designArea;
	}

	public void setDesignArea(String designArea) {
		this.designArea = designArea;
	}

	@Override
	public String toString() {
		return super.toString()+"skill=" + skill + ", designArea=" + designArea;
	}
	
	
}
