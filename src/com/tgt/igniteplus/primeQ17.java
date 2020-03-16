package com.tgt.igniteplus;

import java.util.Scanner;

public class primeQ17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,i=0,num=0;
        System.out.println("Enter range");
        a=sc.nextInt();
        b=sc.nextInt();
        String prime="";
        for(i=a;i<=b;i++)
        {
            int counter=0;
            for(num=i; num>=1; num--)
            {
                if(i%num==0)
                {
                 counter=counter+1;
                }
            }
            if(counter==2)
            {
                prime=prime+ i +" ";
            }
        }
        System.out.println("Prime numbers from "+a+" to "+b+" are:");
        System.out.println(prime);
    }
}
