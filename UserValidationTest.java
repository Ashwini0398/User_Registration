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
                result = userRegistration.validateFirstName.validate("Ashwini");
                Assert.assertTrue(result);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }

        @Test
        public void givenFirstNameInvalid() {
            boolean result = false;
            try {
                result = userRegistration.validateFirstName.validate("ashwini");
            } catch (Exception e) {

                e.printStackTrace();
            }
            Assert.assertFalse(result);
        }

        @Test
        public void givenLastNameValid() {
            boolean result = true;
            try {
                result = userRegistration.validateLastName.validate("Khonde");
            } catch (Exception e) {

                e.printStackTrace();
            }
            Assert.assertTrue(result);
        }

        @Test
        public void givenLastNameInvalid() {
            boolean result = false;
            try {
                result = userRegistration.validateLastName.validate("khonde");
            } catch (Exception e) {

                e.printStackTrace();
            }
            Assert.assertFalse(result);
        }

        @Test
        public void givenEmailValid() {
            boolean result = true;
            try {
                result = userRegistration.validateEmail.validate("ashwinikhonde03@gmail.com");
            } catch (Exception e) {

                e.printStackTrace();
            }
            Assert.assertTrue(result);
        }

        @Test
        public void givenEmailInvalid() {
            boolean result = false;
            try {
                result = userRegistration.validateEmail.validate("ashwinikhonde");
            } catch (Exception e) {

                e.printStackTrace();
            }
            Assert.assertFalse(result);
        }

        @Test
        public void givenMobileNoValid() {
            boolean result = true;
            try {
                result = userRegistration.validateMobileno.validate("+91 9437726849");
            } catch (Exception e) {

                e.printStackTrace();
            }
            Assert.assertTrue(result);
        }

        @Test
        public void givenMobileNoInvalid() {
            boolean result = false;
            try {
                result = userRegistration.validateMobileno.validate("2928824525");
            } catch (Exception e) {

                e.printStackTrace();
            }
            Assert.assertFalse(result);
        }

        @Test
        public void givenPasswordValid() {
            boolean result = true;
            try {
                result = userRegistration.validatePassword.validate("A1@12g449");
            } catch (Exception e) {

                e.printStackTrace();
            }
            Assert.assertTrue(result);
        }

        @Test
        public void givenPasswordFourInvalid() {
            boolean result = false;
            try {
                result = userRegistration.validatePassword.validate("dfffds");
            } catch (Exception e) {

                e.printStackTrace();
            }
            Assert.assertFalse(result);
        }
}
   

