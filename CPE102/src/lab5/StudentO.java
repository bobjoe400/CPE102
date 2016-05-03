package lab5;

import java.util.ArrayList;

public class StudentO {
	
	private String name;
	private ArrayList<Double> grades;
	
	public StudentO(String name){
		grades = new ArrayList<Double>();
		this.name = name;
	}
	
	public void addGrade(double grade){
		grades.add(grade);
	}
	
	public double getGrade(){
		double grade = 0;
		for(double d: grades){
			grade+=d;
		}
		return grade;
	}
	
	public String getName(){
		return name;
	}
	
	public String toString(){
		return ""+getName()+": "+getGrade();
	}
}
