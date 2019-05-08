package com.company;

public class changyonglei3 {
    Integer integer(int a){                     //包装类与基本数据类型之间转换
        Integer integer = new Integer(a);
        return integer;
    }
    String string(Integer a ){                  //Integer转string
        String string = Integer.toString(a);
        return string;
    }
    Integer integer2(String str){
        Integer a = new Integer(str);           //string转 Integer
        return a;
    }
    String string2(int a){                      //string转int
        String s = a+"";
        return s;
    }

    public static void main(String[] args) {
        changyonglei3 cyl =new changyonglei3();
        String s1 = "666";
        Integer a = 55;
        System.out.println(cyl.integer(a));
        System.out.println(cyl.string(a));
        System.out.println(cyl.integer2(s1));
        System.out.println(cyl.string2(a));
    }
}
