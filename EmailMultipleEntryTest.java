package com.bridgelabz;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class EmailMultipleEntryTest {

	
	private String Email;
	
	private String expected;
	
	public EmailMultipleEntryTest(String email,String expected) {
		
		this.Email = email;
		this.expected = expected;		
	}
	@Parameterized.Parameters
	public static Collection parameters()
	{
		return Arrays.asList(new Object[][]{
			
			{"Ashwinikhonde@gmail.com","Ashwinikhonde@gmail.com"},
			{"abc@yahoo.com","abc@yahoo.com"},
			{"abc123@.com","abc123@gmail.com"}
				
				});
	}
	
	
	@Test
	public void givenEmail(){
		EmailMultipleEntry e = new EmailMultipleEntry();
        boolean result=e.validateEmail(Email);
        Assert.assertTrue(expected,result);
    }

}
