package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class changyonglei4_6 {
    Boolean Finally(String str){
        String regex = "\\w*abc";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }

    public static void main(String[] args) {
        changyonglei4_6 cyl = new changyonglei4_6();
        String s = "sdadhsjakdhsaabc";
        System.out.println(cyl.Finally(s));
    }

}
