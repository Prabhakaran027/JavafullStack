package ThreadProgramming;

public class DaemonThreadExample {

    public static void main(String[] args) {

        DemoThread d1=new DemoThread();
        DemoThread d2=new DemoThread();
        DemoThread d3=new DemoThread();

        d1.setDaemon(true);
        d1.start();
        d2.start();
        d3.start();

        System.out.println(d1.isDaemon());
        System.out.println(d2.isDaemon());
        System.out.println(d3.isDaemon());
    }

}
