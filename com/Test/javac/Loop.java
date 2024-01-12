package com.Test.javac;

public class Loop {

    public static void main(String[] args) {

        int a = 5, b = 10, c = 15;

        if (a > b) {                               //a>b - expression - evaluated to boolean value - false
            System.out.println("Hi everyone!!");
        } else {
            System.out.println("Bye everyone!!");
        }

        //if-elseif-else ladder
        if (a > b) {                               //a>b - expression - evaluated to boolean value - false
            System.out.println("Hi everyone!!");
        } else if (b > c) {
            System.out.println("Good Morning everyone!!");
        } else if (c > a) {
            System.out.println("Good Afternoon everyone!!");
        } else {
            System.out.println("Bye everyone!!");
        }

        //Nested if-else
        if (a > b)                                //outer if
        {
            if (a > c) {                           //inner if
                System.out.println(a + " is greater");
            } else {
                System.out.println(c + " is greater");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is greater");
            } else {
                System.out.println(c + " is greater");
            }
        }

        int i = 1;
        do {
            System.out.println("i is " + i);
            i++;
        } while (i <= 10);
    }

// for loop
}


