package com.company;

public class changyonglei2 {

    String reverse(String str){                        //反转
        StringBuffer sb = new StringBuffer(str);
        String s=sb.reverse().toString();
        return s;
    }
    String append(String str1,String str2){             //添加
        StringBuffer stringBuffer=new StringBuffer();
        return stringBuffer.append(str1+str2).toString();
    }
    String delete(String str,int a,int b){              //删除
        StringBuffer sb = new StringBuffer(str);
        return sb.delete(a,b).toString();
    }
    String insert(String str1,String str2,int a){       //插入
        StringBuffer sb = new StringBuffer(str1);
        return sb.insert(a,str2).toString();
    }

    public static void main(String[] args) {
        changyonglei2 cyl =new changyonglei2();
        String s1="this is a test of java";
        String s2="test";
        System.out.println(cyl.append(s1,s2));
        System.out.println(cyl.insert(s1,s2,5));
        System.out.println(cyl.reverse(s1));
        System.out.println(cyl.delete(s1,0,5));
    }

}
