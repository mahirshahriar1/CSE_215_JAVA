package com.tasks;

public class testCourse {

	public static void main(String[] args) {
		Course cse215=new Course("Programming Langauge-II");		

		cse215.addStudent("Homelander");
		cse215.addStudent("Soldier Boy");
		cse215.addStudent("Maeve");
		
		System.out.println("Registered students of "+ cse215.getCourseName()+": ");
		
		String[] temp=cse215.getStudents();
		
		int numOfStudents=cse215.getNumberOfStudents();
		
		for(int i=0;i<numOfStudents;i++)
		{
			System.out.println(temp[i]);
		}
		System.out.println();
		
		cse215.addStudent("Butcher");
		cse215.addStudent("Kimiko");
		
		System.out.println("Registered students of "+ cse215.getCourseName()+": ");
		
		temp=cse215.getStudents();
		
		numOfStudents=cse215.getNumberOfStudents();
		
		for(int i=0;i<numOfStudents;i++)
		{
			System.out.println(temp[i]);
		}
		System.out.println();
		
		//dropping 1 student
		cse215.dropStudent("Soldier Boy");
		
		System.out.println("Registered students of "+ cse215.getCourseName()+": ");
		
		temp=cse215.getStudents();
		
		numOfStudents=cse215.getNumberOfStudents();
		
		for(int i=0;i<numOfStudents;i++)
		{
			System.out.println(temp[i]);
		}
		System.out.println();
		
		
		
		
	}

}
