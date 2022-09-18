package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("OK");
//        list.add(12);
//        list.add(new StringBuilder("builder"));
//        list.add(new Car());

        list.add("hello");
        list.add("dear");
        list.add("friend");

        for (String o:
             list) {
            System.out.println(o + " length " + o.length());
        }
    }
}

class Car{}