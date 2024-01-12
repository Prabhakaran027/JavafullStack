package com.Test.ThreadProgramming;


class Mythread extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}


public class ThreadCreateExample1 {

    public static void main(String[] args) {

        Mythread t1=new Mythread();
        t1.start();

        //t1.run();

        Mythread t2=new Mythread();
        t2.start();
    }

}