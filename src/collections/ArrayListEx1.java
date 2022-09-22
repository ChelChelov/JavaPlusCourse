package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>(2);
        arrayList1.add("Oleg");
        arrayList1.add("Sasha");
        arrayList1.add("Ivan");
        System.out.println(arrayList1);

//        ArrayList<String> arrayList2 = new ArrayList<>(200);
//        List<String> arrayList3 = new ArrayList<>();
//        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
//        System.out.println(arrayList4);
    }
}
