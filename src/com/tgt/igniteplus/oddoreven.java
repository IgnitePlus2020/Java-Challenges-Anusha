package com.tgt.igniteplus;

import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        if(n%2==0)
            System.out.println(n+" is an even number");
        else
            System.out.println(n+" is an odd number");
    }
}
