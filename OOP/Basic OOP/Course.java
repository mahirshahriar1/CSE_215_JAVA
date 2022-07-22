package com.tasks;

import java.util.Scanner;

public class Course {

		private String courseName;
		private String [] students;
		private int numberOfStudents;
		
		Scanner input=new Scanner (System.in);
		
		public Course(String courseName)
		{
			this.courseName=courseName;
			students=new String[3];
			numberOfStudents=0;
		}		
		
		public String getCourseName()
		{
			return courseName;
		}
		
		public void addStudent(String student) 
		{ 			 		
			if(numberOfStudents==students.length)
			{
				String[] temp=new String[numberOfStudents+1];			
				for(int i=0;i<numberOfStudents;i++)
					temp[i]=students[i];	
				
				students=temp;
				temp=null;			
			}
			students[numberOfStudents++]=student;			
		}
		
		public void dropStudent(String name)
		{	
			int index=getStudentIndex(name);
			if(index>=0)
			{
				for(int i=index; i<numberOfStudents-1;i++)
				{
					students[i]=students[i+1];
				}
				students[--numberOfStudents]=null;
			}
			else {
				System.out.println("No student with this name found");
			}
		
		}
		
		public int getStudentIndex(String student)
		{
			for(int i=0;i<numberOfStudents;i++)
			{
				if(students[i].equals(student))
					return i;
			}
			return -1;
		}
		
		
		public String[] getStudents() {
			return students;
		}
		
		public int getNumberOfStudents() {
			return numberOfStudents;
		}
		
		
		public void clear()
		{
		   String[] temp=new String[3];
		   students=temp;
		   numberOfStudents=0;
		}
		
		public void display()
		{
			if(numberOfStudents==0){
				System.out.println("\nNo students enrolled in : "+courseName);				
			}
			else {
				System.out.println("\nCourse name is : "+courseName);
				System.out.println("Students in this course are : ");
				for(int i=0;i<numberOfStudents;i++)
					System.out.println((i+1)+" - "+students[i]);
			}
			
		}
		
}
