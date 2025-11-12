package JAVA.Collection_FrameWork;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class Set_LinkedHashSet {
    public static void main(String[] args) {
        Set b = new LinkedHashSet();
        b.add("Rohit");
        b.add("Virat");
        b.add("Rohit");
        b.add(null);
        b.add(123);
        b.add(true);
        b.add("Virat");
        System.out.println(b.size());
        System.out.println(b.isEmpty());
        System.out.println(b.contains("Virat"));
        System.out.println(b.remove(null));

        Iterator itr=b.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
