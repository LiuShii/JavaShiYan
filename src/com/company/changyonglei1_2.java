package com.company;

public class changyonglei1_2 {
    String SubString(String str){
        String s1=str.substring(10,14);
        return s1;
    }

    public static void main(String[] args) {
        changyonglei1_2 cyl =new changyonglei1_2();
        String s="this is a test of java";
        System.out.println(cyl.SubString(s));
    }
}
