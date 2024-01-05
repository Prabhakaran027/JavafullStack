package ThreadProgramming;

class DemoThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }

    }
}
public class ThreadPriorityExample {

    public static void main(String[] args) {
        DemoThread d1=new DemoThread();
        d1.setPriority(Thread.MAX_PRIORITY);
        //d1.setPriority(5);
        DemoThread d2=new DemoThread();
        d2.setPriority(Thread.MIN_PRIORITY);


        d1.start();
        d2.start();


        System.out.println(d1.getPriority());
        System.out.println(d2.getPriority());
    }

}
