package com.exemple.maven.classroom;

import java.text.DecimalFormat;

public class Student extends Person {
	
	private double firstGrade = 0.0;
	private double secondGrade  = 0.0;
	private double thridGrade  = 0.0;
	private double averageGrade  = 0.0;
	
	

	
	public double getFirstGrade() {
		return firstGrade;
	}


	public void setFirstGrade(double firstGrade) {
		this.firstGrade = firstGrade;
	}


	public double getSecondGrade() {
		return secondGrade;
	}


	public void setSecondGrade(double secondGrade) {
		this.secondGrade = secondGrade;
	}


	public double getThridGrade() {
		return thridGrade;
	}


	public void setThridGrade(double thridGrade) {
		this.thridGrade = thridGrade;
	}


	public double getAverageGrade() {
		return averageGrade;
	}


	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}


	public double calculateAverage( ){
		double averageGrader = (this.firstGrade + this.secondGrade + this.thridGrade) /3;
		setAverageGrade(averageGrader);
		return averageGrader;
		
	}
	
	
	public double calculateAverage(double firstGrade, double secondGrade, double thirdGrade){
		double averageGrader = (firstGrade + secondGrade + thirdGrade) /3;
		setAverageGrade(averageGrader);
		return averageGrader;
	}
	

			
	public boolean hasClearedTheCourse(){
		if (getAverageGrade() < 6.0) {
			return false;
		}else {
			return true;
		}
	}


	public String toString() {
		//calculateAverage(this.firstGrade + this.secondGrade + this.thridGrade);
		DecimalFormat df = new DecimalFormat("#.0");
		if(hasClearedTheCourse()) {
			return "Student " + getFirstName() + " " + getLastName() + 	
					"\nGrade: " + getFirstGrade()+", " + getSecondGrade()+", " + getThridGrade() +
					"\nFindal grade: "+ df.format(getAverageGrade()) +
					"\nThe Student has cleared the couse" +
					"\n-------------------------------" ;		
		}else {
			return "Student " + getFirstName() + " " + getLastName() + 	
					"\nGrade: " + getFirstGrade()+", " + getSecondGrade()+", " + getThridGrade() +
					"\nFindal grade: "+ df.format(getAverageGrade()) +
					"\nThe Student has not cleared the couse" +
					"\n-------------------------------\n\n" ;	
		}

	}


	public Student(int age, String firstName, String lastName, char gender) {
		super(age, firstName, lastName, gender);
		// TODO Auto-generated constructor stub
	}

}
