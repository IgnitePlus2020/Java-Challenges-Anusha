package com.tgt.igniteplus;

import java.util.Scanner;

public class oddevensum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n,i,oddsum=0,evensum=0;
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            if(i%2!=0)
                oddsum+=i;
            else
                evensum+=i;
        }
        System.out.println("Even numbers sum = "+evensum+" \nOdd numbers sum = "+oddsum);
    }
}
