package comm.example.sampledate;

public class MyDate {
	private int date, month, year;
	
	public int getDay() {
		return date;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public boolean setDay(int d) {
		date = d;
		if(date > 30) {
			System.out.println("Day should be less than 30 ");
			System.exit(0);
		}
			return true;
	}
	
	public boolean setMonth(int m) {
		month = m;
		if(month > 12) {
			System.out.println("Month should be less than 12 ");
			System.exit(0);
		}
		return true;
	}
	
	public boolean setYear(int y) {
		year = y;
		if(year > 2019) {
			System.out.println("Year should be less than 2019 ");
			System.exit(0);
		}
		return true;
	}
}
