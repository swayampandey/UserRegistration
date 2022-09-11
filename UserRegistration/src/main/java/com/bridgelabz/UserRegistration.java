package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

    public static boolean validFirstName() {
        String name = "Aadi";
        Pattern P = Pattern.compile("[A-Z][a-z]{3}");
        Matcher m = P.matcher(name);
        if (m.find() && m.group().equals(name)) {
            System.out.println("Valid first name");
            return true;
        } else {
            System.out.println("Invalid last name");
            return false;
        }
    }

    public static boolean validLastName() {
        String name = "Seth";
        Pattern P = Pattern.compile("[A-Z][]a-z]{3}");
        Matcher m = P.matcher(name);
        if (m.find() && m.group().equals(name)) {
            System.out.println("Valid last name");
            return true;
        } else {
            System.out.println("Invalid last name");
            return false;
        }
    }
    public static boolean validEmailId(){
        String id = "abc.xyz@bl.co.in";
        Pattern P = Pattern.compile("[a-zA-z0-9][a-zA-z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-z]+)+");
        Matcher m = P.matcher(id);
        if(m.find() && m.group().equals(id)){
            System.out.println("Valid email id");
            return true;
        }
        else{
            System.out.println("Invalid email id");
            return false;
        }
    }
    public static boolean validMobileNo(){
        String number = "918052658752";
        Pattern P = Pattern.compile("(0|91)?[6-9][0-9]{9}");
        Matcher m = P.matcher(number);
        if(m.find() && m.group().equals(number)){
            System.out.println("Valid mobile number");
            return true;
        }
        else{
            System.out.println("Invalid mobile number");
            return false;
        }
    }
    public static boolean validPassWord(){
        System.out.println("Please enter password :");
        String password = "Horizon8";
        Pattern P = Pattern.compile("[a-zA-Z0-9]{8}");
        Matcher m = P.matcher(password);
        if(m.find() && m.group().equals(password)){
            System.out.println("Valid password");
            return true;
        }
        else{
            System.out.println("Invalid password");
            return false;
        }
    }
}

