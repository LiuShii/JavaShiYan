package com.company;


public class changyonglei4_3 {
    String RpDisappear(String str){

        String s =str.replaceAll("(\\w)/1*","");
        return s;


    }

    public static void main(String[] args) {

        changyonglei4_3 cyl = new changyonglei4_3();
        String s = "aaa";
        System.out.println(cyl.RpDisappear(s));
    }
}
//表达式错误
