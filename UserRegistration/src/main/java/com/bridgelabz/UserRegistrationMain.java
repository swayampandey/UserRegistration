package com.bridgelabz;

import javax.xml.namespace.QName;
import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationMain {

    public static void main(String[] args) {
       UserRegistration userRegistration = new UserRegistration();
        userRegistration.validFirstName();
        userRegistration.validLastName();
        userRegistration.validEmailId();
        userRegistration.validPassWord();
    }
}
