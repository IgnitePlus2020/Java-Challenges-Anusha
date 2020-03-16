package com.tgt.igniteplus;

import java.util.Scanner;

public class swap2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter 2 numbers a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = "+a+" b = "+b);
    }


}
