package com.Test.ExceptionHandling;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTypes {

    public static void main(String[] args) {

        //BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

       // System.out.println("Enter any number:");
        try(BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println("Enter any number:");
            int n=Integer.parseInt(bufferedReader.readLine());//checked exception
            System.out.println(n/0);//unchecked exception

        }
        catch (NumberFormatException e) { //checked exception

            System.out.println(e.getMessage());
        }
        catch (IOException e) { //checked exception

            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) { //checked exception

            System.out.println(e.getMessage());
        }
    }

}
