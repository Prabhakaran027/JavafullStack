package com.Test.ExceptionHandling;

import java.io.IOException;

class CustomAgeHandling{
    private int age;
    public CustomAgeHandling(){
        age = 10;
    }
    public CustomAgeHandling(int age){
        this.age = age;
    }
    void CustomAgeHandling() throws CustomException {
        if (age>=18){
            System.out.println("Eligible for vote");
        }
        else throw new CustomException("not eligible for vote");{

        }
    }
}
public class CustomExceptionHandling {
    public static void main(String[] args) {
        EligibilityChecker checker = new EligibilityChecker(56);
        EligibilityChecker checker1 = new EligibilityChecker(12);

        try {
            checker.EligibleVoter();
            checker1.EligibleVoter();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

