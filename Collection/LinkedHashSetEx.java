package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(11);
        linkedHashSet.add(22);
        linkedHashSet.add(33);
        linkedHashSet.add(44);
        linkedHashSet.add(55);

        System.out.println(linkedHashSet);

        System.out.println(linkedHashSet.getFirst());
        System.out.println(linkedHashSet.contains(11));
        linkedHashSet.addFirst(79);
        linkedHashSet.addLast(63);
        System.out.println(linkedHashSet.contains(88));
        System.out.println(linkedHashSet.removeFirst());
        System.out.println(linkedHashSet.removeLast());

        System.out.println(linkedHashSet);

    }
}
