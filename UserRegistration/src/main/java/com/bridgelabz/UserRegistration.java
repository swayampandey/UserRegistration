package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

    public void validLastName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your last name :");
        String name = sc.next();
        Pattern P = Pattern.compile("[A-Z][]a-z]{3}");
        Matcher m = P.matcher(name);
        if(m.find() && m.group().equals(name)){
            System.out.println("Valid last name");
        }
        else{
            System.out.println("Invalid last name");
        }

    }
}
