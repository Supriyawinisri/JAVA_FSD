package comm.example.client;

import comm.example.sampledate.MyDate;

public class Tester2 {
	public static int day ;
	public static int month;
	public static int year;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate mydate = new MyDate();
		mydate.setDay(78);
		mydate.setMonth(12);
		mydate.setYear(1997);
		day = mydate.getDay();
		month = mydate.getMonth();
		year = mydate.getYear();
		
		System.out.println(day+"-"+month+"-"+year);
	}
	
}
