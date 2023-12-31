package ThreadProgramming;


class TestThread extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().threadId());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(Thread.currentThread().isInterrupted());
        System.out.println(Thread.currentThread().isDaemon());

    }
}
public class CurrentThreadDetails {

    public static void main(String[] args) {

        TestThread t1=new TestThread();
        TestThread t2=new TestThread();
        t1.setName("test thread");
        t1.start();

    }

}
