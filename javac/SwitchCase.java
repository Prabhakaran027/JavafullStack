package javac;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("=======================");
        System.out.println(" 1 -> Sunday");
        System.out.println(" 2 -> Monday");
        System.out.println(" 3 -> Tuesday");
        System.out.println(" 4 -> Wednesday");
        System.out.println(" 5 -> Thursday");
        System.out.println(" 6 -> Friday");
        System.out.println(" 7 -> Saturday");
        System.out.println("===========================");
        System.out.print("\t Enter Your Choice:");
        choice = scanner.nextInt();
        System.out.println("===========================");

        switch (choice)//control variable
        {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Wrong choice!!");
        }
        System.out.println("===========================");
    }
}
