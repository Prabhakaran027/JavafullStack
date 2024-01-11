package OOPs;
class Parent{
    int a = 10;
    int b = 20;
    public void Multiple(){

        System.out.println((a*b));
    }
}
class Child extends Parent {
    public void Result(){
        int c = 30;
        int d = 40;
        System.out.println(c*d);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.Multiple();
        child.Result();
    }
}
