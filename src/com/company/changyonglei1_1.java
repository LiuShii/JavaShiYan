package com.company;

public class changyonglei1_1 {
    int jisu(String str){
        char[] ch=str.toCharArray();
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            if(ch[i]=='s')
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        changyonglei1_1 cyl=new changyonglei1_1();
        String s="this is a test of java";
        System.out.println(" 1"+cyl.jisu(s));
    }

}
