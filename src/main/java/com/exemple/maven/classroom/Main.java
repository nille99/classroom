package com.exemple.maven.classroom;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student> Students = new ArrayList<Student>();		 
		Classroom classroom = new Classroom("Kvalit17", "Fall 2017", Students);
		
		Student Student = new Student(26, "Klara", "anderson", 'w');
		classroom.addANewStudent(Student);
		Student.setFirstGrade(8.0);
		Student.setSecondGrade(8.0);
		Student.setThridGrade(8.0);
		Student.calculateAverage();
		
		Student Student2 = new Student(18, "Anna", "ek", 'w');
		classroom.addANewStudent(Student2);
		Student2.setFirstGrade(8.0);
		Student2.setSecondGrade(4.0);
		Student2.setThridGrade(3.0);
		Student2.calculateAverage();
		
		Student Student3 = new Student(32, "Kalle", "Svenson", 'w');
		classroom.addANewStudent(Student3);
		Student3.setFirstGrade(18.0);
		Student3.setSecondGrade(7.0);
		Student3.setThridGrade(15.0);
		Student3.calculateAverage();
		
		classroom.printFullRelatory();

		

	}

}
