package com.Test.ExceptionHandling;

import java.io.IOException;

class EligibilityChecker{
    private int age;
    public EligibilityChecker(){
        age = 10;
    }
    public EligibilityChecker(int age){
        this.age = age;
    }
    void EligibleVoter() throws IOException {
        if (age>=18){
            System.out.println("Eligible for vote");
        }
        else throw new IOException("not eligible for vote");{

        }
    }
}
public class ThrowsKeyword {
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

