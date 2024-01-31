package com.Basics.javac;

import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        int Num, Value;
        Scanner input = new Scanner(System.in);

        System.out.println("enter Num : ");
        Num = input.nextInt();

        System.out.println("enter Value : ");
        Value = input.nextInt();

        System.out.println("Result : " + (Num + Value));
    }
}
