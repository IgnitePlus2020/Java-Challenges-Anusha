package com.tgt.igniteplus;

import java.util.Scanner;

public class SeriesQ16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n,i,s,j;
        n=sc.nextInt();
        for(i=1,j=1;i*4<=n&&j<=n;i++)
        {
            if (i % 3 != 0) {
                s = 4 * i;
                System.out.print(j+" ");
                j=j+s;
            }
        }
    }
}
