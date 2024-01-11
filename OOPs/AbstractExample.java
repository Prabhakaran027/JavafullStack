package OOPs;

// An Abstract class can be extended by another abstract class.
// can contain constructor in abstract class.
// We cannot create instance of the Abstract class.
// an abstract class contains abstract method and maybe/may-not have normal method
// we can declare static class in abstract class

abstract class Test {
    abstract void test();

    void sample()               // normal method
    {
        System.out.println("This is a non-abstract method ");
    }

    static void demo() {         // Static method
        System.out.println("this is static method");
    }

    final void me() {            // final method
        System.out.println("this is final method");
    }

}

class TestImplementation extends Test {
    @Override
    void test() {
        System.out.println("This is the body of test method");
    }

   /*
    abstract void me(){
        System.out.println("gbgf");
    }
    */
}

public class AbstractExample {

    public static void main(String[] args) {

        Test obj = new TestImplementation();
        TestImplementation tesImp = new TestImplementation();

        obj.test();
        obj.sample();

        tesImp.test();
        tesImp.sample();

       // Test object = new Test();   --> can't create an instanceof abstract class.

    }
}
