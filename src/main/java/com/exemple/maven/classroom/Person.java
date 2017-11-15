package com.exemple.maven.classroom;

public class Person {
	private int age = 0;
	private String firstName = "";
	private String lastName = "";
	private char gende = 'M';
	
	
	
	public Person(int age, String firstName, String lastName, char gende) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gende = gende;
	}
		
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGende() {
		return gende;
	}
	public void setGende(char gende) {
		this.gende = gende;
	}
	

}
