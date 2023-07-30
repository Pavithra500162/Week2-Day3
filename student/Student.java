package org.student;

import org.deparment.Department;

public class Student extends Department{

	public static void studentName()
	{
		String sName="Pavithra";
		System.out.println("Student Name:\t"+sName);
	}
	public static void studentDepartment()
	{
		String SDepatment="CT-UG";
		System.out.println("Student Department:\t"+SDepatment);
	}
	public static void StudentId()
	{
		int SId=35;
		System.out.println("Student Id:\t"+SId);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.studentName();
		s.StudentId();
		s.studentDepartment();
		s.depatmentName();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
	}

}
