package com.Test.Collection;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("India");
        treeSet.add("Paris");
        treeSet.add("Pakistan");
        treeSet.add("USA");
        treeSet.add("UK");

        System.out.println(treeSet);
        treeSet.addAll(Arrays.asList("London","New York")); //the Representative indexed - value is changed to given value.

        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());

        System.out.println(treeSet);
    }
}
