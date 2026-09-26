package com.DesignPattern;

public class AttendanceService {	

	DBConnection db = DBConnection.getInstance();
	
	public void MarkAttendance(int StudentId) {
		db.executeQuery("insert into attendance values("+ StudentId +", 'present')");
		System.out.println("AttendanceMark for Student:" + StudentId);
		
	}
	
}
