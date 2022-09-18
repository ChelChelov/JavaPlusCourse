package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Hello");
//        System.out.println(info1);
//        String s = info1.getValue();
//        System.out.println(s);
//
//        Info<Integer> info2 = new Info<>(5);
//        System.out.println(info2);
//        Integer i = info2.getValue();
//        System.out.println(i);

        Info<String> info1 = new Info<>();
        info1.setValue("Damn");

        System.out.println(info1);
    }
}

class Info<T>{
    private T value;

//    public Info(T value) {
//        this.value = value;
//    }

    public Info(){}



    public T getValue(){
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}