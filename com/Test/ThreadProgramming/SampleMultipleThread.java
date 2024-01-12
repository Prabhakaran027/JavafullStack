package com.Test.ThreadProgramming;

import java.util.Scanner;

class Multiple extends Thread{
    public void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        for ( int i = 1; i<=10 ;i++){
            System.out.println(n+ " * " + i + " = " + (i*n));
        }
    }
}
public class SampleMultipleThread {
    public static void main(String[] args) {
        Multiple m1 = new Multiple();
        m1.start();
    }
}
