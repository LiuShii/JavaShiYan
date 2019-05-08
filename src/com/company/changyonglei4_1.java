package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class changyonglei4_1 {
    boolean demo(String str){
        String s = "^\\(\\d{4}\\)\\d{4}-\\d{4}$";
        Pattern pattern =Pattern.compile(s);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String s1= "(0000)0000-0000";
        String s2 = "2222)0000-1111";

        changyonglei4_1 cyl = new changyonglei4_1();
        System.out.println(cyl.demo(s1));
        System.out.println(cyl.demo(s2));
    }
}
