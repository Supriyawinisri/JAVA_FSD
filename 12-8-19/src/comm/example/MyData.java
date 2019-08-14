package comm.example;

public class MyData {
	private int date;
	private int month;
	private int year;
	
	public void createDate(int d, int m, int y) {
		if(d>30) {
			System.out.println("Day can't be greater than 30");
			System.exit(0);
		}
		if(m>12) {
			System.out.println("Month can't be greater than 12");
			System.exit(0);
		}
		if(y>1990 && y<2019) {
			System.out.println("Wrong year");
			System.exit(0);
		}
		date = d;
		month = m;
		year = y;
	}
	
	public String getDetails() {
		return date+"-"+month+"-"+year;
	}

	
}
