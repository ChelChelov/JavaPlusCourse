package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

//        List<?> list = new ArrayList<String>();
//        list.add("String");
//
//        List<? extends Number> list3 = new ArrayList<Integer>();
//        list3.add(4);

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(9.01);
        list1.add(5.45);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("ok");
        list2.add("hi");
        list2.add("bue");
        showListInfo(list2);

        ArrayList<Double> list4 = new ArrayList<>();
        list4.add(3.14);
        list4.add(9.01);
        list4.add(5.45);
        System.out.println(summ(list4));
    }

    static void showListInfo(List<?> list){
        System.out.println("My list has the next elements: " + list);
    }

    public static double summ(ArrayList<? extends Number> list){
        double summ = 0;
        for (Number n:
             list) {
                summ += n.doubleValue();
        }
        return summ;
    }

    static void showListInfo2(List<?> list){
        System.out.println("My list has the next elements: " + list);
    }
}
