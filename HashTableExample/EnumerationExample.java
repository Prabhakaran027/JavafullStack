package HashTableExample;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationExample {

    public static void main(String[] args) {

        Vector<Float> vector=new Vector<Float>(12);

        vector.add(12.56f);
        vector.add(15.77f);
        vector.add(17.11f);
        vector.add(19.22f);
        vector.add(55.56f);
        vector.add(77.56f);

        Enumeration<Float> enumeration=Collections.enumeration(vector);
        Iterator<Float> iterator = vector.iterator();

        while(enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }

    }

}
