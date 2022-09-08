package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

    public void validMobileNo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mobile number :");
        String number = sc.next();
        Pattern P = Pattern.compile("(0|91)?[6-9][0-9]{9}");
        Matcher m = P.matcher(number);
        if(m.find() && m.group().equals(number)){
            System.out.println("Valid mobile number");
        }
        else{
            System.out.println("Invalid mobile number");
        }

    }
}
