package com.exemple.maven.classroom;

import java.util.ArrayList;

public class Classroom {
	
	private String classroomName = "Kvalit16";
	private String classroomTerm = "Fall 2016";
	private ArrayList<Student> Students = new ArrayList<Student>();
	
	
	public Classroom(String classroomName, String classroomTerm, ArrayList<Student> students) {
		super();
		this.classroomName = classroomName;
		this.classroomTerm = classroomTerm;
		Students = students;
	}


	public String getClassroomName() {
		return classroomName;
	}


	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}


	public String getClassroomTerm() {
		return classroomTerm;
	}


	public void setClassroomTerm(String classroomTerm) {
		this.classroomTerm = classroomTerm;
	}


	public ArrayList<Student> getStudents() {
		return Students;
	}


	public void setStudents(ArrayList<Student> students) {
		Students = students;
	}
	

	public void addANewStudent(Student student){
		this.Students.add(student);
	}
	

	
	public void removeAStudent(String firstName){
		for (int i = 0; i < Students.size();i++) {
			if(Students.get(i).getFirstName().equals(firstName)) {
				this.Students.remove(Students.get(i));	
				System.out.println("Student"+ firstName + "successfully removed");
			}
		}	
	
			System.out.println("The student does not exist!");

	}
	

	public void printFullRelatory(){
		System.out.println("Classroom name: " + getClassroomName()+" classroomTerm: " + getClassroomTerm() + "\n" +
		Students.get(0)+Students.get(1)+Students.get(2));
		//private String classroomName = "Kvalit16";
		//private String classroomTerm = "Fall 2016";
		//private ArrayList<Student> Students = new ArrayList<Student>();
			
		//"\n" + getStudents()  );
		
	}




  

	
	/*
	2. removeAStudent(String firstName). This method takes in a student’s first name and
	search the student within the array. If the student exists, the student is removed from
	the list and the method prints out the message “Student”+ #firstName# + ”successfully
	removed”. Otherwise, the method prints out the message “The student does not exist!”
	
	3. printFullRelatory(): This method prints out a string that contains the name of the
	classroom, the term and a list of all students that belong to the class.
	*/
}
