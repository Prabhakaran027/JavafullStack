package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;


public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(11);
        list.add(11);
        list.add(11);
        list.add(11);
        list.add(11);
        list.add(11);
        list.add(11);
        list.add(12);

        //System.out.println(list);

        List<Double> list1 = new ArrayList<Double>();

        list1.add(11.2);
        list1.add(12.3);
        list1.add(14.6);
        list1.add(1.6);
        list1.add(19.6);
        list1.add(17.6);
        list1.add(10.7);
        list1.add(1.1);

        list1.add(111.0);
        //System.out.println(list1);

        //Standard for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        //Advanced for loop
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println();

        //foreach loop - Java 8
        list.forEach(
                x -> System.out.println(x)   //lambda expression
        );
        System.out.println();

        //using iterator interface

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        System.out.println(list.contains(177));
        System.out.println(list.get(5));
        System.out.println(list.indexOf(99));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.remove(1));
        //list.remove(new Integer(23));
        System.out.println(list);

        System.out.println(list.removeAll(Arrays.asList(11, 22, 33)));
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.set(3, 222));
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list.reversed());
        System.out.println(list);
        System.out.println(list.containsAll(Arrays.asList(22, 33)));
        List<Integer> sublist = list.subList(1, 3);

        System.out.println(sublist);
        list.replaceAll(x -> x * 2);
        System.out.println(list);
        list.trimToSize();
        System.out.println(list);


        list.clear();
    }

}

