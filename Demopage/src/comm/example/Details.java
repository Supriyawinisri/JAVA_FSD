package comm.example;

public class Details {
	
	private String title, season;
	private int year;
	
	public Details() {
		super();
	}
	
	public Details(String title, String season, int year) {
		super();
		this.title = title;
		this.season = season;
		this.year = year;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getSeason() {
		return season;
	}
	
	public void setSeason(String season) {
		this.season = season;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

}
