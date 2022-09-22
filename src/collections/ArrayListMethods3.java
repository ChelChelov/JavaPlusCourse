package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Oleg");
        arrayList1.add("Sasha");
        arrayList1.add("Ivan");
        arrayList1.add("Elena");
        arrayList1.add("Vasya");

        List<Integer> list1 = List.of(3, 8, 13);
        System.out.println(list1);

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);

//        Object[] array = arrayList1.toArray();
//        String[] array2 = arrayList1.toArray(new String[5]);
//
//        for (String s:
//             array2) {
//            System.out.println(s);
//        }

//        List<String> list = arrayList1.subList(0, 3);
//        list.add("Yan");
//
//        System.out.println(list);
//        System.out.println(arrayList1);

//        System.out.println(arrayList1.get(1));

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Petya");
//        arrayList2.add("Sveta");
//        arrayList2.add("Lolya");
//        arrayList2.add("Ivan");

//        arrayList1.retainAll(arrayList2);
//        arrayList1.removeAll(arrayList2);
//        System.out.println(arrayList1);

//        boolean result = arrayList1.containsAll(arrayList2);
//        System.out.println(result);

    }
}
