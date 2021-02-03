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
	
	
	  public boolean validateFirstName(String FirstName) throws UserException{
            try {
                Pattern pattern = Pattern.compile(regexfname);
                boolean res = pattern.matcher(FirstName).matches();
                return res;
            }
            catch (Exception e){
                throw new UserException("invalid entry");
            }

        }

        public boolean validateLastName(String LastName) throws UserException{
            try {
                Pattern pattern = Pattern.compile(regexlname);
                boolean res = pattern.matcher(LastName).matches();
                return res;
            }
            catch (Exception e){
                throw new UserException("invalid Entry");
            }
        }

        public static boolean validateEmail(String Email) throws UserException{
            try {
                Pattern pattern = Pattern.compile(regexemail);
                boolean res = pattern.matcher(Email).matches();
                return res;
            }
            catch (Exception e){
                throw new UserException("invalid Entry");
            }
        }

        public boolean validateMobileNo(String MobileNo) throws UserException{
            try {
                Pattern pattern = Pattern.compile(regexmobileno);
                boolean res = pattern.matcher(MobileNo).matches();
                return res;
            }
            catch (Exception e){
                throw new UserException("invalid Entry");
            }
        }



        public boolean validatePassword(String Password) throws UserException{
            try {
                Pattern pattern = Pattern.compile(regexpassword);
                boolean res = pattern.matcher(Password).matches();
                return res;
            }
            catch (Exception e){
                throw new UserException("invalid Entry");
            }
        }
    }

