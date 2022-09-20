package generics;

import java.util.List;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Hello");
//        System.out.println(info1);
//        String s = info1.getValue();
//        System.out.println(s);

        Info<Integer> info2 = new Info<>(5);
        System.out.println(info2);
        Integer i = info2.getValue();

        Info<Double> info3 = new Info<>(5.4);
        System.out.println(info3);
        Double d = info3.getValue();

    }
}




class Info<T extends Number>{
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public Info(){}

    public T getValue(){
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }
}

//class Parent{
//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }
//}
//
//class Child extends Parent{
//
//    @Override
//    public void abc(Info<Integer> info){
//        Integer i = info.getValue();
//    }
//}

interface I1{}
interface I2{}