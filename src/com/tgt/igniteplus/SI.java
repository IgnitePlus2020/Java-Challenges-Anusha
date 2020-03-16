package com.tgt.igniteplus;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter values for principle, time and rate of interest");
        float p,t,r,si;
        p=s.nextFloat();
        t=s.nextFloat();
        r=s.nextFloat();
        si=(p*t*r)/100;
        System.out.println("Simple interest = "+si);
    }
}
