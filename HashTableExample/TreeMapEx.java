package HashTableExample;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("v", 235346);
        treeMap.put("b", 346252);
        treeMap.put("i", 456254);
        treeMap.put("s", 456665);
        treeMap.put("M", 564665);
        treeMap.put("j", 735967);

//      System.out.println(treeMap.putFirst("", null));
        System.out.println(treeMap);
    }
}
