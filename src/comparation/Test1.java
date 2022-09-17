package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Oleg");
        list.add("Vlad");
        list.add("Sasha");
        System.out.println("Before sort:");
        System.out.println(list);
        System.out.println("After sort:");
        Collections.sort(list);
//        for (String s:
//             list) {
//            System.out.println(s);
//        }
        System.out.println(list);
    }
}
