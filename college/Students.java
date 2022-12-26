package org.college;

public class Students {
	 
	public void getStudentInfo(int studentId) {
		System.out.println(studentId);
	}
	public void getStudentInfo(int studentId, String studentName) {
		System.out.println(studentId+" "+studentName);
	}
	public void getStudentInfo(String studentEmailId, long studentPhoneNumber) {
		System.out.println(studentEmailId+" "+studentPhoneNumber);
	}
	public static void main(String[] args) {
		Students study=new Students();
		study.getStudentInfo(1234);
		study.getStudentInfo(1234, "raju");
		study.getStudentInfo("Raju@2001", 7993569455L);
		
	}
}