package UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegisrationSystem {
	String regexfname="^[A-Z]{1}[a-z]+$";
	
	public static void main(String[] args) 
	{
		UserRegisrationRegex ob1 = new UserRegisrationRegex();
		
		while(true)
		{
		System.out.println("Enter the user input");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
			switch(input)
			{
			case 1: 
				ob1.Name();   
				break;
			default:
				System.out.println("you have entered the wrong choice");
				break;
			}
		}
	}
	public void Name()
	{
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the first name of the user");
		String fname = s1.nextLine();
		Pattern p = Pattern.compile(regexfname);
		Matcher m= p.matcher(fname);
		boolean val =m.matches();
		if(val == true)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
	}
}

