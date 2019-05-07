package com.company;

public class changyonglei1_5 {
    StringBuffer reverse(String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        return stringBuffer;
    }
    void freverse(String str){
        char[] a = str.toCharArray();

        for (int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }


    }

    public static void main(String[] args) {
        String s="this is a test of java";
        changyonglei1_5 cyl =new changyonglei1_5();
        System.out.println(cyl.reverse(s));
        cyl.freverse(s);
    }
}
