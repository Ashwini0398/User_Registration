package com;

import java.util.regex.Pattern;

public class UserValidation {
	
	String regexfname="^[A-Z]{1}[a-z]+$";
	String regexlname="^[A-Z]{1}[a-z]+$";
	String regexemail="^([a-zA-Z0-9]*[+._-]*[a-zA-Z0-9]+@[a-zA-Z]+.{3}[a-zA-z.]*[a-zA-z]{2})+$";
	String regexmobileno="^[+]{1}[9][1][ ][6-9]{1}[0-9]{9}$";
	String regexpassword1="^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
	String regexpassword2="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";
	String regexpassword3 = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
	String regexpassword4="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,10}$";
	
	
	 public boolean validateFirstName(String FirstName) {
	        Pattern pattern = Pattern.compile(regexfname);
	        boolean res = pattern.matcher(FirstName).matches();
	        return res;

	    }

	    public boolean validateLastName(String LastName) {
	        Pattern pattern = Pattern.compile(regexlname);
	        boolean res = pattern.matcher(LastName).matches();
	        return res;
	    }

	    public boolean validateEmail(String Email) {
	        Pattern pattern = Pattern.compile(regexemail);
	        boolean res = pattern.matcher(Email).matches();
	        return res;
	    }

	    public boolean validateMobileNo(String MobileNo) {
	        Pattern pattern = Pattern.compile(regexmobileno);
	        boolean res = pattern.matcher(MobileNo).matches();
	        return res;
	    }

	    public boolean validatePassword1(String Password1) {
	        Pattern pattern = Pattern.compile(regexpassword1);
	        boolean res = pattern.matcher(Password1).matches();
	        return res;
	    }

	    public boolean validatePassword2(String Password2) {
	        Pattern pattern = Pattern.compile(regexpassword2);
	        boolean res = pattern.matcher(Password2).matches();
	        return res;
	    }

	    public boolean validatePassword3(String Password3) {
	        Pattern pattern = Pattern.compile(regexpassword3);
	        boolean res = pattern.matcher(Password3).matches();
	        return res;
	    }

	    public boolean validatePassword4(String Password4) {
	        Pattern pattern = Pattern.compile(regexpassword4);
	        boolean res = pattern.matcher(Password4).matches();
	        return res;
	    }
}


