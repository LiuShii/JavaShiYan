package com.company;

public class changyonglei1_3 {
    char[] Tochararray(String str){
        char[] ch=str.toCharArray();
        return ch;
    }

    public static void main(String[] args) {
        String s="this is a test of java";
        changyonglei1_3 cyl =new changyonglei1_3();
        System.out.println(cyl.Tochararray(s));
    }
}
