package com;

import java.util.regex.Pattern;

public class UserValidation {
	
	String regexfname="^[A-Z]{1}[a-z]+$";
	String regexlname="^[A-Z]{1}[a-z]+$";
	String regexemail="^([a-zA-Z0-9]*[+._-]*[a-zA-Z0-9]+@[a-zA-Z]+.{3}[a-zA-z.]*[a-zA-z]{2})+$";
	String regexmobileno="^[+]{1}[9][1][ ][6-9]{1}[0-9]{9}$";
	String regexpassword="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,10}$";
	
    UserValidator validateFirstName = (s) -> (Pattern.compile(regexfname).matcher(s).matches());
    UserValidator validateLastName = (s) -> (Pattern.compile(regexlname).matcher(s).matches());
    UserValidator validateEmail = (s) -> (Pattern.compile(regexemail).matcher(s).matches());
    UserValidator validateMobileno = (s) -> (Pattern.compile(regexmobileno).matcher(s).matches());
    UserValidator validatePassword = (s) -> (Pattern.compile(regexpassword).matcher(s).matches());
}
