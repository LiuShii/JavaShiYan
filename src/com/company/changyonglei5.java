package com.company;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class changyonglei5 {
    String IfDbeyondM(String str){
        int year = Integer.valueOf(str.substring(0,4));
        int month = Integer.valueOf(str.substring(5,7));
        int date = Integer.valueOf(str.substring(8));            //将字符串中的日期提出来
        LocalDate ld = LocalDate.of(year,month,date);
        String time = ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        return time;
    }

    public static void main(String[] args) {
        changyonglei5 cyl = new changyonglei5();
        Scanner scanner = new Scanner(System.in);
        String StrTime = scanner.nextLine();
        System.out.println(cyl.IfDbeyondM(StrTime));
        LocalDateTime localTime = LocalDateTime.now();
        System.out.println("短格式："+localTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("中格式："+localTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("长格式："+localTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("满格式："+localTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println("修改年："+ localTime.plusYears(1));
        System.out.println("修改月："+ localTime.plusMonths(1));
        System.out.println("修改日："+ localTime.plusDays(1));
        System.out.println("修改时："+ localTime.plusHours(1));

    }
}
