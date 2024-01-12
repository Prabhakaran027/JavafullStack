package com.Test.javac;
import java.lang.Math;
public class Express {
    public static void main(String[] args) {
        int a = 5;
        int x = 4;
        int b = 6;
        int c = 7;
        int e = 8;

        double d = (a* Math.pow(x,5) + b * Math.pow(x,3) + c);
        System.out.println(d);

        double g = Math.exp((2*x) - (4*x));
        System.out.println(g);

        double s = Math.sqrt(Math.sin(a) + Math.tan(a) - Math.pow(e,2*x));
        System.out.println(s);

    }
}