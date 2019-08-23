package password.com.example;
import java.lang.*;

public class UserMainCode {
  public String password;
  
	public UserMainCode() {
		// TODO Auto-generated constructor stub
		super();
	}
	public UserMainCode(String password)
	{
		super();
		this.password=password;
	}
	public static boolean checkPassword(String password)
	{
		int count=0;
		int upCount=0;
		int lwCount=0;
		int spCount=0;
		if(password.length()>=8)
		{
			for(int i=0;i<password.length();i++)
			{
				char c=password.charAt(i);
				if(Character.isUpperCase(c))
				{
					upCount++;
				}
				if(Character.isLowerCase(c))
				{
					lwCount++;
				}
				if(Character.isDigit(c))
				{
					count++;
				}
				if(c>=33&&c<=46||c==64)
				{
					spCount++;
				}
				if(upCount>=1&&lwCount>=1&&count>=1&&spCount>=1)
				{
					return true;
				}
				
			}
			return true;
		}
		else 
		{
		
		return false;
		
	}
	}

}
