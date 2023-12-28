package OOPs;

class Outer{
    public static int a = 10;
    private static int b = 20;
    public static void outerClass(){
        System.out.println("this is outer class");
    }
    static class Inner{
        void innerTest(){
            System.out.println(a);
            System.out.println(b);
        }
    }

}
public class StaticNestedClass {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.innerTest();
        Outer.outerClass();
    }
}
