package org.college;

public class Student extends Dept {
	private void studntName() {
		System.out.println("student name is shyam");
	}
private void studntDept() {
	System.out.println("student dept is MECH");
}
private void studntId() {
System.out.println("student id is 9046");	
}
public static void main(String[] args) {
	Student s=new Student();
	s.collegeCode();
	s.collegeName();
	s.collegRank();
	s.studntDept();
	s.studntId();
	s.studntName();
	s.hostelName();
	s.deptName();
	
}
}
