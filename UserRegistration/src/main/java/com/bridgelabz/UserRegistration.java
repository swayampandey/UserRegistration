package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

    public void validSampleEmail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your emil id :");
        String emailId = sc.next();
        Pattern P = Pattern.compile("[a-zA-z0-9][a-zA-z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-z]+)+");
        Matcher m = P.matcher(emailId);
        if(m.find() && m.group().equals(emailId)){
            System.out.println("Valid email id");
        }
        else{
            System.out.println("Invalid email id");
        }

    }
}
