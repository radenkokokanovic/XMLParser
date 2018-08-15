package com.example.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> listaStudenata=new ArrayList<Student>();
		listaStudenata.add(new Student(101, "Radenko", 25));
		listaStudenata.add(new Student(102, "Slavko", 24));
		listaStudenata.add(new Student(110, "Jovan", 15));
		listaStudenata.add(new Student(105, "Nenad", 30));
		
		Collections.sort(listaStudenata);
		
		for (Student student : listaStudenata) {
			System.out.println("Student");
			System.out.println(student.getRollNo()+ " "+student.getName()+" "+student.getAge());
		}
	}
}
