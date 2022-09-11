package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class UserRegistrationMainTest {

    @Test
    public void testValidFirstName(){
        boolean result = UserRegistration.validFirstName();
        Assertions.assertTrue(result);
    }
    @Test
    public void testValidLastName(){
        boolean result = UserRegistration.validLastName();
        Assertions.assertTrue(result);
    }
    @Test
    public void testValidEmailId(){
        boolean result = UserRegistration.validEmailId();
    }
    @Test
    public void testValidPassword(){
        boolean result = UserRegistration.validPassWord();
    }
}
