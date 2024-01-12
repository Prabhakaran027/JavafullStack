package com.Test.javac;

public class Operation {
    public static void main(String[] args) {

        int a = 10, b = 20;
        boolean status = true;

        //Arithmetic operator
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println(" ");


        //Relational operator - boolean
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        System.out.println(" ");

        //Logical operators
        System.out.println(a > b && a > 10);//true
        System.out.println(a > b || a > 10);
        System.out.println(!(a > b));

        System.out.println(" ");

        //Assignment operators
        a = 20;
        System.out.println(a);
        a += 10;                     //a=a+10
        System.out.println(a);
        a /= 2;  //a=a/2
        System.out.println(a);

        System.out.println(" ");

        //Shift operator
        System.out.println(5 >> 2);// 5/4=1
        System.out.println(2 << 4);// 2*8=16

        System.out.println(" ");

        //Bitwise operator
        System.out.println(a < b & a < 19);
        System.out.println(a > b | a > 10);

        System.out.println(" ");

        //Ternary operator
        status = (a > b)&&(a<10) ? true : false;
        System.out.println(status);

        System.out.println(" ");

        //unary
        System.out.println(a++);  //a++  a=a+1
        System.out.println(a--);  //a--  a=a-1
        System.out.println(++a);
        System.out.println(--a);
    }
}
