package com.Test.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> set1 = new HashSet<>();

        set.add("India");
        set.add("Paris");
        set.add("Pakistan");
        set.add("USA");
        set.add("UK");

        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(set.size());
        System.out.println(set.contains("India"));
        System.out.println(set.isEmpty());
        System.out.println(set.remove(0));
        System.out.println(set);
        set.addAll(Arrays.asList("UAE","South Korea"));

        System.out.println(set.addAll(set1));
        System.out.println(set);

        HashSet<String> copy=(HashSet<String>) set.clone();
        System.out.println(copy);

        copy.clear();
        System.out.println(copy);

        set.clear();
        System.out.println(set);
    }
}
