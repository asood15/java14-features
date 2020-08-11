package com.ashima.records;

public class StudentImpl {

	public static void main(String[] args) {
        
		Student student = new Student("ashima","sood",123,12);
        System.out.println("Student name: "+ student.firstName() + student.lastName() );
}
}
