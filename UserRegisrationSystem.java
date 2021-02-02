package UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidEntryException extends Exception       //created the parent class for User defined exception
{
    public InvalidEntryException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}


public class UserRegisrationSystem {

	 Scanner s1 = new Scanner(System.in);

	String regexfname="^[A-Z]{1}[a-z]+$";
	String regexlname="^[A-Z]{1}[a-z]+$";
	String regexemail="^([a-zA-Z0-9]*[+._-]*[a-zA-Z0-9]+@[a-zA-Z]+.{3}[a-zA-z.]*[a-zA-z]{2})+$";
	String regexmobileno="^[+]{1}[9][1][ ][6-9]{1}[0-9]{9}$";
	String regexpassword1="^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$"; //minimum 8 character
	String regexpassword2="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";   ////users password  Rule2  minimum 8 character at least one letter, one number and one special character:
	String regexpassword3 = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$"; //Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character
	String regexpassword4="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,10}$";//Minimum eight and maximum 10 characters, at least one uppercase letter, one lowercase letter, one number and one special character	

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
				try
				{
					ob1.Name();
				}
				catch(InvalidEntryException e)
				{
					System.out.println(e);
				}
				break;
				
			case 2:
				try
				{
					ob1.mail();
				}
				catch(InvalidEntryException e)
				{
					System.out.println(e);
				}
				break;
			case 3:
				try
				{
					ob1.Mobileno();
				}
				catch(InvalidEntryException e)
				{
					System.out.println(e);
				}
				break;
				
			case 4:
				try
				{
					ob1.Password();
				}
				catch(InvalidEntryException e)
				{
					System.out.println(e);
				}
				break;
				
			case 5:
				//user sample email address check valid or not

				int UserInput=0;
				System.out.println("check the email entered valid or not");
				while(UserInput==0)
				{	
					try
					{
					ob1.mail();
					System.out.println("Do you want to check the email valid or not \n 0) to check or press any key to enter");
					UserInput = s.nextInt();
					}
					catch(InvalidEntryException e)
					{
						System.out.println(e);
					}
				}
				break;

			default:
				System.out.println("you have entered the wrong choice");
				break;
			}
		}
	}

	public void Name() throws InvalidEntryException       //declared the exception to the method
	{
		
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
			throw new InvalidEntryException("invalid: "+fname);        //thrown the exception
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
			throw new InvalidEntryException("invalid: "+lname);
		}
	}

	public void mail() throws InvalidEntryException       //declared the exception to the method
	{
		System.out.println("enter the email of the user");
		String email = s1.nextLine();
		Pattern p = Pattern.compile(regexemail);
		Matcher m= p.matcher(email);
		boolean val =m.matches();
		if(val == true)
		{
			System.out.println("valid");
		}
		else
		{
			throw new InvalidEntryException("invalid: "+email);		}
	}

	public void Mobileno() throws InvalidEntryException       //declared the exception to the method
	{
		System.out.println("enter the mobile number of the user");
		String mno = s1.nextLine();
		Pattern p = Pattern.compile(regexmobileno);
		Matcher m= p.matcher(mno);
		boolean val =m.matches();
		if(val == true)
		{
			System.out.println("valid");
		}
		else
		{
			 throw new InvalidEntryException("invalid: "+mno);
		}
	}
	
	public void Password() throws InvalidEntryException       //declared the exception to the method
	{
		System.out.println("enter the password of the user");
		String pword = s1.nextLine();
		Pattern p = Pattern.compile(regexpassword1);
		Matcher m= p.matcher(pword);
		boolean val =m.matches();
		if(val == true)
		{
			System.out.println("valid");
		}
		else
		{
			throw new InvalidEntryException("invalid: "+pword);
		}

		System.out.println("enter the password of the user rule2");
		String pword2 = s1.nextLine();
		Pattern p1 = Pattern.compile(regexpassword2);
		Matcher m1= p1.matcher(pword2);
		boolean val2 =m1.matches();
		if(val2 == true)
		{
			System.out.println("valid");
		}
		else
		{
			throw new InvalidEntryException("invalid: "+pword2);
		}

		System.out.println("enter the password of the user rule3");
		String pword3 = s1.nextLine();
		Pattern p3 = Pattern.compile(regexpassword3);
		Matcher m3= p3.matcher(pword3);
		boolean val3 =m3.matches();
		if(val3 == true)
		{
			System.out.println("valid");
		}
		else
		{
			throw new InvalidEntryException("invalid: "+pword3);
		}
	
		System.out.println("enter the password of the user rule4");
		String pword4 = s1.nextLine();
		Pattern p4 = Pattern.compile(regexpassword4);
		Matcher m4= p4.matcher(pword4);
		boolean val4 =m4.matches();
		if(val4 == true)
		{
			System.out.println("valid");
		}
		else
		{
			throw new InvalidEntryException("invalid: "+p4);
		}	
	}
 
}
