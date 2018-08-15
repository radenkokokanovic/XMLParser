package com.example.Comparable;

public class Student implements Comparable<Student>{
	
	private int rollNo;
	private String name;
	private int age;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student st) {
		
		if(this.age==st.age)
		{
			return 0;
		}else if (this.age>st.age) {
			return -1;
		}else
		{
			return 1;
		}
	}
	
	
}
