package org.college;

public class Student extends Department{
public void studentName()
{
	System.out.println("Student name is Velammal");
}
public void studentDept()
{
	System.out.println("Student Department is ECE");
}

public void studentId()
{
	System.out.println("Student ID is 1234");
}
public static void main(String[] args) {

	Student sd = new Student();
	sd.depName();
	sd.studentDept();
	sd.studentName();
	sd.studentId();
	sd.collegeCode();
	sd.collegeName();
	sd.collegeRank();
}
}
