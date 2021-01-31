package com.bridgelabz;

import java.util.regex.Pattern;

public class EmailMultipleEntry {

	String regexemail="^([a-zA-Z0-9]*[+._-]*[a-zA-Z0-9]+@[a-zA-Z]+.{3}[a-zA-z.]*[a-zA-z]{2})+$";
	
	public boolean validateEmail(String Email) {
        Pattern pattern = Pattern.compile(regexemail);
        boolean res = pattern.matcher(Email).matches();
        return res;
    }
}
