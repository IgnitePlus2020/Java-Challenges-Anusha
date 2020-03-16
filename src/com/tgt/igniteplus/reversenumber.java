package com.tgt.igniteplus;

import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        int n,num,rev=0,dig;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        n=sc.nextInt();
        num=n;
        while (num!=0)
        {
            dig=num%10;
            rev=(rev*10)+dig;
            num=num/10;
        }
        System.out.println("Reverse: "+rev);
    }
}
