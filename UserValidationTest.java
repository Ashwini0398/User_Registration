package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import com.UserValidation;


public class UserValidationTest {
	UserValidation uv=new UserValidation();
	
	@Test
        public void givenFirstNameValid() {
            boolean result = true;
            try {
                result = userRegistration.validateFirstName("Ashwini");
                Assert.assertTrue(result);
            }
            catch (UserException e)
            {

            }

        }

        @Test
        public void givenFirstNameInvalid() {
            boolean result = false;
            try {
                result = userRegistration.validateFirstName("ashwini");
            } catch (UserException e) {

                e.printStackTrace();
            }
            Assert.assertFalse(result);
        }

        @Test
        public void givenLastNameValid() {
            boolean result = true;
            try {
                result = userRegistration.validateLastName("Khonde");
            } catch (UserException e) {

                e.printStackTrace();
            }
            Assert.assertTrue(result);
        }

        @Test
        public void givenLastNameInvalid() {
            boolean result = false;
            try {
                result = userRegistration.validateLastName("khonde");
            } catch (UserException e) {

                e.printStackTrace();
            }
            Assert.assertFalse(result);
        }

        @Test
        public void givenEmailValid() {
            boolean result = true;
            try {
                result = userRegistration.validateEmail("ashwinikhonde03@gmail.com");
            } catch (UserException e) {

                e.printStackTrace();
            }
            Assert.assertTrue(result);
        }

        @Test
        public void givenEmailInvalid() {
            boolean result = false;
            try {
                result = userRegistration.validateEmail("ashwinikhonde");
            } catch (UserException e) {

                e.printStackTrace();
            }
            Assert.assertFalse(result);
        }

        @Test
        public void givenMobileNoValid() {
            boolean result = true;
            try {
                result = userRegistration.validateMobileNo("+91 9437726849");
            } catch (UserException e) {

                e.printStackTrace();
            }
            Assert.assertTrue(result);
        }

        @Test
        public void givenMobileNoInvalid() {
            boolean result = false;
            try {
                result = userRegistration.validateMobileNo("2928824525");
            } catch (UserException e) {

                e.printStackTrace();
            }
            Assert.assertFalse(result);
        }

        @Test
        public void givenPasswordValid() {
            boolean result = true;
            try {
                result = userRegistration.validatePassword("A1@12g449");
            } catch (UserException e) {

                e.printStackTrace();
            }
            Assert.assertTrue(result);
        }

        @Test
        public void givenPasswordFourInvalid() {
            boolean result = false;
            try {
                result = userRegistration.validatePassword("dfffds");
            } catch (UserException e) {

                e.printStackTrace();
            }
            Assert.assertFalse(result);
        }
}

