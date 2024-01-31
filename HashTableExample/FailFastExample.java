package HashTableExample;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() == 11) {
                list.remove(1);
            }
        }
    }
}
