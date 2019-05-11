package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class changyonglei4_8 {
    void Extract(String str){
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        Boolean result = matcher.find();
        while(result){
            System.out.print(matcher.group()+" ");
            result = matcher.find();
        }
    }

    public static void main(String[] args) {
        changyonglei4_8 cyl = new changyonglei4_8();
        String s = "ae256dd—w348e6";
        cyl.Extract(s);
    }
}
