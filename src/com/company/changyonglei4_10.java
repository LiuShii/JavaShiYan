package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class changyonglei4_10 {
    void findip(String str){
        Pattern pattern =Pattern.compile("(%CXLL.*?(?=%))");
        Matcher matcher =pattern.matcher(str);
        boolean result=matcher.find();
        while(result){
            System.out.println(matcher.group(1));
            result=matcher.find();

        }

    }

    public static void main(String[] args) {
        changyonglei4_10 cyl = new changyonglei4_10();
        String s = "%...%CXLL=add1,31,123.12%CXLL=add2,32,124%CXLL=,33,125.12%LL=-121.11";
        cyl.findip(s);
    }
}
