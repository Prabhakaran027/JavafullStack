package com.Test.ExceptionHandling;

class Agechecker{
    private int age;
     public Agechecker(){
         age = 10;
     }
     public Agechecker(int age){
         this.age = age;
     }
     void Voter(){
         if (age>=18){
             System.out.println("Eligible for vote");
         }
         else throw new RuntimeException("not eligible for vote");{

         }
     }
}
public class ThrowKeyword {
    public static void main(String[] args) {
        Agechecker agechecker = new Agechecker(56);
        Agechecker agechecker1 = new Agechecker(12);

        try {
            agechecker.Voter();
            agechecker1.Voter();
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
