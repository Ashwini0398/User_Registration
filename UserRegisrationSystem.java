package UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegisrationSystem {
	String regexfname="^[A-Z]{1}[a-z]+$";
	String regexlname="^[A-Z]{1}[a-z]+$";
	String regexemail="^([a-zA-Z0-9]*[+._-]*[a-zA-Z0-9]+@[a-zA-Z]+.{3}[a-zA-z.]*[a-zA-z]{2})+$";
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
			case 2:
				ob1.mail();
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

		System.out.println("enter the last name of the user");
		String lname = s1.nextLine();
		Pattern p1 = Pattern.compile(regexlname);
		Matcher m1= p1.matcher(lname);
		boolean val2 = m1.matches();
		if(val2 == true)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}

		m.matches();
		}
	}
	public void mail()
	{
		Scanner s2 = new Scanner(System.in);
		System.out.println("enter the email of the user");
		String email = s2.nextLine();
		Pattern p = Pattern.compile(regexemail);
		Matcher m= p.matcher(email);
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
