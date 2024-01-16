package com.Test.Lambda;
interface Drawable{
    public void draw();

}
/*class Draw implements Drawable{
    @Override
    public void draw() {

    }
}*/
public class LambdaExample {
    public static void main(String[] args) {
        Drawable drawable =() -> {
            System.out.println("draw method invoked");
        };
        drawable.draw();
    }
}
