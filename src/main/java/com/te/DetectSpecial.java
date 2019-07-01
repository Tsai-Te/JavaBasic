package com.te;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectSpecial{
    public int getSpecialCharacterCount(String s) {
        if (s == null || s.trim().isEmpty()) {
            System.out.println("Incorrect format of string");
            return 0;
        }
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(s);
        // boolean b = m.matches();
        boolean b = m.find();
        if (b == true)
            System.out.println("There is a special character in my string ");
        else
            System.out.println("There is no special char.");
        return 0;
    }

    public static void main(String[] args){
        DetectSpecial detectSpecial=new DetectSpecial();

    }
}