package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class changyonglei4_2 {
    void findip(String str){
        Pattern pattern =Pattern.compile("(\\d{1,3}.){3}\\d{1,3}");
        Matcher matcher =pattern.matcher(str);
        boolean result=matcher.find();
        while(result){
            System.out.println(matcher.group());
            result=matcher.find();

        }

    }

    public static void main(String[] args) {
        changyonglei4_2 cyl = new changyonglei4_2();
        String s ="故障PROBLE,服务器:181.116.222.88发生: CPU空181.116.222.884闲5分钟内小于20%故障!";
        cyl.findip(s);

    }
}
