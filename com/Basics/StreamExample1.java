package com.Basics;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class StreamExample1 {

    public static void main(String[] args) {

        //filter

        List<String> languages = Arrays.asList("C", "Java", "Python", "SQL", "C#", "PHP", "C++");

        //filter - intermediate operation
        //foreach - terminal operation
        languages.stream()
                .filter(l -> !l.startsWith("C"))
                .forEach(x -> System.out.println(x)
                );
        //filter, map - intermediate operation
        //collect - terminal operation
        List<String> myLanguages = languages.stream()
                .filter(l -> l.startsWith("C"))
                .map(x -> x.toLowerCase())
                .collect(Collectors.toList());
        System.out.println(myLanguages);

        //Sorted- intermediate operation
        List<String> orderedList = languages.stream()
                .sorted().collect(Collectors.toList());
        System.out.println(orderedList);


        List<Integer> numbers = Arrays.asList(12, 67, 90, 33, 56, 66, 8, 3, 95, 33, 12);

        numbers.stream()
                .forEach(x -> System.out.print(x + " "));

        System.out.println();

        numbers.stream()
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.print(x + " "));

        System.out.println();

        numbers.stream()
                .filter(x -> x % 2 != 0)
                .forEach(x -> {
                    System.out.print(x + " ");
                });

        System.out.println();
        numbers.stream()
                .sorted()
                .forEach(x -> {
                    System.out.print(x + " ");
                });

        //sorted - intermediate operation - used to sort the elements
        System.out.println();
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(x -> {
                    System.out.print(x + " ");
                });

        //distinct() - intermediate operation returns distinct elements stream
        System.out.println();
        numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(x -> {
                    System.out.print(x + " ");
                });

        System.out.println();

        //Limit
        languages.stream()
                .limit(3)
                .forEach(x -> {
                    System.out.println(x + " ,");
                });

        List<String> list = Arrays.asList("C", "Java", "Python", "SQL", "C#", "PHP", "C++");

        boolean status = list.stream()
                .anyMatch(v -> {
                    return v.startsWith("C");
                });
        System.out.println(status);

        //allMatch
        status = list.stream()
                .allMatch(v -> {
                    return v.endsWith("Programming");
                });

        System.out.println(status);

        //noneMatch
        status = list.stream()
                .noneMatch(v -> {
                    return v.endsWith("SQL");
                });

        System.out.println(status);

        //count
        long count = list.stream()
                .count();
        System.out.println(count);
        
    }
}