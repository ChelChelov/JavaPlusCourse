package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(13);
        arrayList.add(-5);
        arrayList.add(52);
        arrayList.add(1);
        arrayList.add(12);
        arrayList.add(6);
        arrayList.add(-2);
        arrayList.add(19);
        arrayList.add(32);
        arrayList.add(-18);
        arrayList.add(0);
        arrayList.add(22);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        

//        int index1 = Collections.binarySearch(arrayList, 12);
//        System.out.println(index1);

//        Employee emp1 = new Employee(12, "Oleg", 1000);
//        Employee emp2 = new Employee(15, "Egor", 600);
//        Employee emp3 = new Employee(96, "Masha", 900);
//        Employee emp4 = new Employee(4, "Sasha", 800);
//        Employee emp5 = new Employee(21, "Vova", 1500);
//        Employee emp6 = new Employee(65, "Petya", 2000);
//        Employee emp7 = new Employee(17, "Leha", 400);
//
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(emp1);
//        employeeList.add(emp2);
//        employeeList.add(emp3);
//        employeeList.add(emp4);
//        employeeList.add(emp5);
//        employeeList.add(emp6);
//        employeeList.add(emp7);
//
//        Collections.sort(employeeList);
//        System.out.println(employeeList);
//        int index2 = Collections.binarySearch(employeeList, new Employee(4, "Sasha", 800));
//        System.out.println(index2);

//        int[] array = {23, 0, -2, 3, -9, 12, 21, -2, 4};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        System.out.println();
//
//        int index3 = Arrays.binarySearch(array, -2);
//        System.out.println(index3);
    }
}

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        int result = this.id - o.id;
        if (result == 0) {
            return this.name.compareTo(o.name);
        }
        return result;
    }
}