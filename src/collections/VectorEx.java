package collections;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Misha");
        vector.add("Oleg");
        vector.add("Sasha");
        vector.add("Vlad");
        vector.add("Ira");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));
    }
}
