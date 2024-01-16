package com.Test.HashTableExample;

import java.util.Hashtable;

public class HashTabExample {
    public static void main(String[] args) {

        Hashtable<Integer,String> hashtable = new Hashtable<>();

        hashtable.put(1,"virat");
        hashtable.put(2, "alex");
        hashtable.put(40, "ishika");
        hashtable.put(5, "sonu");
        hashtable.put(3, "Mrinalini");
        hashtable.put(38, "john");


        System.out.println(hashtable);

        Hashtable<Integer, String> clonedCopy=(Hashtable<Integer, String>) hashtable.clone();

        //hashtable.clear();
        System.out.println(hashtable.contains("john"));
        System.out.println(hashtable.containsKey(89));
        System.out.println(hashtable.containsValue("ishika"));
        System.out.println(hashtable.elements());
        System.out.println(hashtable.keys());
        System.out.println(hashtable.get("sonu"));
        System.out.println(hashtable.getOrDefault("ram", "unnammed"));
        System.out.println(hashtable.isEmpty());
        System.out.println(hashtable.remove(1));
        System.out.println(hashtable.remove(1,"alex"));
        System.out.println(hashtable.size());
        System.out.println(hashtable.replace(38, "john", "robert"));

    }
}
