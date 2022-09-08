package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

    public void validEmailId(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email id :");
        String id = sc.next();
        Pattern P = Pattern.compile("[a-zA-z0-9][a-zA-z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-z]+)+");
        Matcher m = P.matcher(id);
        if(m.find() && m.group().equals(id)){
            System.out.println("Valid email id");
        }
        else{
            System.out.println("Invalid email id");
        }

    }
}
