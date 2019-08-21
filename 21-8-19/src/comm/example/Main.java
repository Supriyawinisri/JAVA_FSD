package password.com.example;

import java.util.*;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the input password");
    Scanner sc=new Scanner(System.in);
    String password=sc.next();
    UserMainCode uc=new UserMainCode();
    
    if(UserMainCode.checkPassword(password))
    {
    	System.out.println("Output:Valid Password");
    }
    else {
    	System.out.println("output:Invalid Password");
    }
	}

}
