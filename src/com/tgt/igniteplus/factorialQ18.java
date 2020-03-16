package com.tgt.igniteplus;

import java.util.Scanner;

public class factorialQ18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int f=1;
        for(int i=1;i<=n;i++)
            f*=i;
        System.out.println("Factorial "+f);
    }
}
