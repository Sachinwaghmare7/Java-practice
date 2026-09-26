package com.DesignPattern;

public class MainApp {
	public static void main(String[] args) {
		
		
		AttendanceService service1 = new AttendanceService();
		AttendanceService service2 = new AttendanceService();
		
		
		service1.MarkAttendance(1);	
		service2.MarkAttendance(102);
		
		//providing Singleton	
		
		DBConnection bd1 =  DBConnection.getInstance();
		DBConnection bd2 =  DBConnection.getInstance();
		System.out.println("same bd  intance ? :"+(bd1 == bd2));
		
		
		
	}

}
