package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import com.UserValidation;


public class UserValidationTest {
	UserValidation uv=new UserValidation();
	
    @Test
    public void givenFirstNameHappy(){
        boolean result=uv.validateFirstName("Ashwini");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstNameSad(){
        boolean result=uv.validateFirstName("ashwini");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastNameHappy(){
        boolean result=uv.validateLastName("Khonde");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastNameSad(){
        boolean result=uv.validateLastName("khonde");
        Assert.assertFalse(result);
    }
    @Test
    public void givenEmailHappy(){
        boolean result=uv.validateEmail("ashwinikhonde@gmail.com");
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmailSad(){
        boolean result=uv.validateEmail("ashwinigmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNoHappy(){
        boolean result=uv.validateMobileNo("91 9182736773");
        Assert.assertTrue(result);
    }
    @Test
    public void givenMobileNoSad(){
        boolean result=uv.validateMobileNo("9182736773");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPasswordOneHappy(){
        boolean result=uv.validatePassword1("ashwiniV");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPasswordOneSad(){
        boolean result=uv.validatePassword1("sdfsf");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPasswordTwoHappy(){
        boolean result=uv.validatePassword2("Ashwini3");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPasswordTwoSad(){
        boolean result=uv.validatePassword2("acgsjdjd");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPasswordThreeHappy(){
        boolean result =uv.validatePassword3("A@12ashwi");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPasswordThreeSad(){
        boolean result=uv.validatePassword3("Aggdvhfdsf");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPasswordFourHappy(){
        boolean result=uv.validatePassword4("@B2sdggdg");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPasswordFourSad(){
        boolean result=uv.validatePassword4("adsasdferf");
        Assert.assertFalse(result);
    }
}

