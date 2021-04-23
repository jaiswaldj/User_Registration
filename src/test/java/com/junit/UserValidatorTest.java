package com.junit;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Deepak");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Dee");
        Assert.assertEquals(true,result);

    }
    @Test
    public void givenFirstName_WhenWithSpChars_ShouldReturnFalse(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Dee@pak");
        Assert.assertFalse(result);
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("abc@gmail.com");
        Assert.assertEquals(true,result);
    }
    @Test
    public void giveLastName_WhenProper_ShouldReturnTrue(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Jaiswal");
        Assert.assertTrue(result);
    }
    @Test
    public void giveLastName_WhenNotProper_ShouldReturnFalse(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Ja");
        Assert.assertFalse(result);
    }
    @Test
    public void giveLastName_WhenFirstLetterwithLowercase_ShouldReturnFalse(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("jaiswal");
        Assert.assertFalse(result);
    }


}
