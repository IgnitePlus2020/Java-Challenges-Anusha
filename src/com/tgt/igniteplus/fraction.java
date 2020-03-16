package com.tgt.igniteplus;

import java.util.Scanner;

public class fraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n,b;
        int a;
        System.out.println("Enter a number with decimal values");
        n=sc.nextDouble();
        a=(int)n;
        b=n-a;
        int l=Double.toString(b).length()-2;
        b=b*Math.pow(10,l);
        int c=(int)b;
        System.out.println(a+" "+c);
    }
}
