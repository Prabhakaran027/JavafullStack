package com.Test.Collection;

import java.util.Vector;
import java.util.Stack;

class Vectors {
    public void Vector() {

        Stack<String> stack = new Stack<String>();

        stack.push("Java");
        stack.push("C");
        stack.push("C++");
        stack.push("Python");
        stack.push("C#");
        stack.push("Php");

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.size());
        System.out.println(stack.add("Go"));
        System.out.println(stack.empty());
        System.out.println(stack.elementAt(0));
        System.out.println(stack.capacity());
        System.out.println(stack.contains("C#"));
        System.out.println(stack.firstElement());
        System.out.println(stack.lastElement());
        System.out.println(stack.get(3));
        System.out.println(stack.set(2, "SQL"));
        System.out.println(stack.remove(2));
    }

}

public class VoctorExample {

    public static void main(String[] args) {

        Vector<Float> vector = new Vector<Float>();

        vector.add(12.56f);
        vector.add(15.77f);
        vector.add(17.11f);
        vector.add(19.22f);
        vector.add(55.56f);
        vector.add(77.56f);
        System.out.println(vector);

        System.out.println(vector.size());
        System.out.println(vector.get(0));


    }

}
