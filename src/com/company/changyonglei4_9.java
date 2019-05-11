package com.company;

public class changyonglei4_9 {
    String Replace(String str){
        String s = str.replaceAll("pupel","pupil");
        return s;
    }

    public static void main(String[] args) {
        changyonglei4_9 cyl = new changyonglei4_9();
        String s = "adhsai pupel sadwa pupel";
        System.out.println(cyl.Replace(s));
    }
}
