package org.college;

public class Student extends College  {
	public void studentName() {
		System.out.println("Daggupati Raju");

}
	public void studentDept() {
		System.out.println("Computer Science");

}
	public void studentId() {
		System.out.println("DA2001");

	}
	public static void main(String[] args) {
		Student obj=new Student();
		
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		obj.deptName();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		
		
		
	}
}
 