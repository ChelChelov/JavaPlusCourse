package collections;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods1 {
    public static void main(String[] args) {
//        ArrayList<String> arrayList1 = new ArrayList<>();
//        arrayList1.add("Oleg");
//        arrayList1.add("Sasha");
//        arrayList1.add("Ivan");
//
//        System.out.println(arrayList1.get(1));

        ArrayList<Human> arrayList = new ArrayList<>();
        Human human1 = new Human(12, "Oleg");
        arrayList.add(human1);
        arrayList.add(new Human(20, "Vlad"));
        arrayList.add(new Human(24, "Sasha"));
        System.out.println(arrayList.contains(human1));

    }
}

class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}