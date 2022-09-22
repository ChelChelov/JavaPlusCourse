package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Oleg");
        arrayList1.add("Sasha");
        arrayList1.add("Ivan");
        arrayList1.add("Elena");
        arrayList1.add("Vasya");

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()){
            iterator.next();

            System.out.println(iterator.next());
        }
    }
}
