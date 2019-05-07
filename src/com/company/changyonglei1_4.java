package com.company;

public class changyonglei1_4 {
    StringBuffer UpperCase(String str){
        StringBuffer stringBuffer = new StringBuffer();
        String[] s1=str.split(" ");
        for(int i=0;i<s1.length;i++) {
            String temp =  s1[i];
            String toUp = s1[i].substring(0, 1).toUpperCase();
            stringBuffer.append(toUp  + temp.substring(1,temp.length()) + " ");
        }
        return stringBuffer;
    }

    public static void main(String[] args) {
        String s="this is a test of java";
        changyonglei1_4 cyl =new changyonglei1_4();
        System.out.println(cyl.UpperCase(s));
    }
}
