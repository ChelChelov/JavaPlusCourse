package collections.map_interfae;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(12, "Vasya");
        map.put(15, "Yulya");
        for (Map.Entry<Integer, String> e:
             map.entrySet()) {
            System.out.println(e.getValue() + " " + e.getKey());
        }
    }
}
