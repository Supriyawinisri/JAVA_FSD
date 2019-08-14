package comm.example.client;

import comm.example.MyData;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyData mydate = new MyData();
		mydate.createDate(10,12,1997);
		System.out.println(mydate.getDetails());
	}

}
