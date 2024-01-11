package OOPs;

// The Variable created inside the interface is final/Constant variable.
// Access modifiers are allowed.
// default method, final and static methods are allowed.

interface Vehicle {
        // Abstract methods.
    void changeGear(int gearNumber);  // abstract void changeGear(int gearNumber);
    void speedUp(int speed);
    void slowDown(int speed);
    void applyBrakes();

    default void TurnOnIndicator(){
        System.out.println("Indicator is ON");
    }
    default void TurnOffIndicator(){
        System.out.println("Indicator is OFF");
    }
    static void Static() {         // Static method
        System.out.println("this is static method");
    }

}
interface Car{
    default void f1(){
        System.out.println("Formula 1 race");
    }
}

class Bike implements Vehicle, Car
{
    int gearNumber;
    int speed;
    public Bike()
    {
        gearNumber=0;
        speed=0;
    }

    @Override
    public void changeGear(int gearNumber) {

        this.gearNumber=this.gearNumber+1;
    }

    @Override
    public void speedUp(int increasedSpeed) {

        this.speed=this.speed + increasedSpeed;
    }

    @Override
    public void slowDown(int decreasedSpeed) {

        this.speed=this.speed - decreasedSpeed;
    }

    @Override
    public void applyBrakes() {

        this.speed = 0;
    }

    void print()
    {
        System.out.println("Gear Number = "+this.gearNumber);
        System.out.println("Speed = "+this.speed);
    }

    static void demo() {         // Static method
        System.out.println("this is static method");
    }

    final void me() {            // final method
        System.out.println("this is final method");
    }

}


class Bicycle implements Vehicle
{
    int gearNumber;
    int speed;

    public Bicycle()
    {
        gearNumber=0;
        speed=0;
    }

    @Override
    public void changeGear(int gearNumber) {

        this.gearNumber=this.gearNumber+1;
    }

    @Override
    public void speedUp(int increasedSpeed) {

        this.speed=this.speed + increasedSpeed;
    }

    @Override
    public void slowDown(int decreasedSpeed) {

        this.speed=this.speed - decreasedSpeed;
    }

    @Override
    public void applyBrakes() {

        this.speed = 0;
    }
    void print()
    {
        System.out.println("Gear Number = "+this.gearNumber);
        System.out.println("Speed = "+this.speed);
    }

}

public class InterfaceExample
{
    public static void main(String[] args)
    {
        Bike bike=new Bike();
        bike.changeGear(3);
        bike.speedUp(20);
        bike.slowDown(5);
        bike.applyBrakes();
        bike.print();
        bike.me();
        Bike.demo();
        //bike.demo();
        bike.TurnOnIndicator();
        //calling multiple inheritance by class
        bike.f1();

        System.out.println();

        Bicycle bicycle=new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(10);
        bicycle.slowDown(3);
        bicycle.applyBrakes();
        bicycle.print();
        bicycle.TurnOffIndicator();


        // calling a static method using interface name
        Vehicle.Static();


    }
}
