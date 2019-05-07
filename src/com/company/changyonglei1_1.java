package com.company;

public class changyonglei1_1 {
    int jisu(String str){

        int count=str.split("s").length-1;
        return count;
    }
    public static void main(String[] args) {
        changyonglei1_1 cyl=new changyonglei1_1();
        String s="this is a test of java";
        System.out.println(cyl.jisu(s));
    }

}
