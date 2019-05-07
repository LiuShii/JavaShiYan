package com.company;

public class changyonglei1_6 {
    void Spilt(String str){
        String[] strings =str.split(" ");
        for(int i=0;i<=strings.length-1;i++){
            System.out.print(strings[i]+" ");
        }
    }

    public static void main(String[] args) {
        String s="this is a test of java";
        changyonglei1_6 cyl =new changyonglei1_6();
        cyl.Spilt(s);
    }
}
