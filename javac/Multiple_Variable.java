package javac;

import java.util.Scanner;

public class Multiple_Variable {
    public static void main(String[] args) {
        int Num1, Num2;
        Scanner input = new Scanner(System.in);

        // value for num1 is 10
        System.out.println("enter Num : ");
        Num1 = input.nextInt();

        // value for num2 is 20
        System.out.println("enter Value : ");
        Num2 = input.nextInt();

        System.out.println("Result : " + (Num1*Num2));
    }
}
