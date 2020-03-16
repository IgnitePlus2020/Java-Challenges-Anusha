package com.tgt.igniteplus;

import java.util.Scanner;

public class swap3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 numbers:");
        System.out.print("a=:");
        a=sc.nextInt();
        System.out.print("b=:");
        b=sc.nextInt();
        System.out.print("c=:");
        c=sc.nextInt();
        System.out.println("After swapping:");
        int tempa,tempb;
        tempa=a;
        a=c;
        tempb=b;
        b=tempa;
        c=tempb;
        System.out.println("a="+a+"\nb="+b+"\nc="+c);
    }
}
