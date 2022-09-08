package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

    public void validPassWord(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter password :");
        String password = sc.next();
        Pattern P = Pattern.compile("[A-Z][a-zA-Z0-9]{7}");
        Matcher m = P.matcher(password);
        if(m.find() && m.group().equals(password)){
            System.out.println("Valid password");
        }
        else{
            System.out.println("Invalid password");
        }

    }
}
