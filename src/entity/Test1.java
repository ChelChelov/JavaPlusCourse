package entity;

public class Test1 {
    public static void main(String[] args) {
        Person person1 = new Person("Stas", 30);
        Person person2 = new Person("Stas", 30);
        System.out.println(person1.equals(person2));

        Object obj = new Object();
        obj.toString();
    }
}
