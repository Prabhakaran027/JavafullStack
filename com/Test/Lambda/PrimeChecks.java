package com.Test.Lambda;
interface NumberChecking{
    String primeCheck(int n);
}
public class PrimeChecks {
    public static void main(String[] args) {

        NumberChecking numberChecking = (num) -> {
            boolean flag = true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i == 0) {
                    flag=false;
                    break;
                }
            }

            if(flag) {
                return "Prime Number.";
            }else {
                return "Composite number";
            }
        };
        System.out.println(numberChecking.primeCheck(37));
        System.out.println(numberChecking.primeCheck(12));
    }
}
