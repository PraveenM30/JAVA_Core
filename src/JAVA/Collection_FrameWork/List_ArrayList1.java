package JAVA.Collection_FrameWork;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_ArrayList1 {
    public static void main(String[] args) {
        List fruits = new ArrayList();
        fruits.add("orange");
        fruits.add("Apple");
        fruits.add("orange");
        fruits.add(123);
        fruits.add(true);
        fruits.add(null);
        fruits.add(123);
        fruits.remove("Orange");
        System.out.println("list is empty: "+fruits.isEmpty());

        Iterator itr = fruits.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
//
//            for (Object obj:fruits){
//                System.out.println(obj);
//            }
        }
    }
}