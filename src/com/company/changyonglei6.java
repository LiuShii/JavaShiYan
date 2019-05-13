package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class changyonglei6 {
    public static void main(String[] args) {
        int[] a=new int[10];
        for(int i = 0;i<10;i++){
            a[i]=(int)(Math.random()*100);
            System.out.print(a[i] + " ");
        }
        int[] b = a.clone();
        Arrays.sort(b);
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        System.out.println(b[sc]);
    }
}
