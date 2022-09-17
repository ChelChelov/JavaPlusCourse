package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee(64, "Oleg", "Sazonov", 600);
        Employee emp2 = new Employee(12, "Sasha", "Lysenko", 900);
        Employee emp3 = new Employee(96, "Vlad", "Yurovskiy", 800);
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        System.out.println("Before sorting: \n" + employees);
        Collections.sort(employees, new SalaryComparator());
        System.out.println("After sorting: \n" + employees);
    }
}


class Employee
            implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {

        //First method to do sort with int

        if (this.id == o.id) {
            return 0;
        } else if (this.id < o.id) {
            return -1;
        } else {
            return 1;
        }

        //Second method to do sort with int

//        return this.id - o.id;

        //Third method to do sort with one of the object-parameters like String or Integer

//        return this.name.compareTo(o.name);

        //Fourth method. If I want to sort by several parameters

//        int res = this.name.compareTo(o.name);
//        if (res == 0){
//            res = this.surname.compareTo(o.surname);
//        }
//        return res;
//    }
    }


//class IdComparator implements Comparator<Employee> {
//    @Override
//    public int compare(Employee emp1, Employee emp2) {
//        if (emp1.id == emp2.id) {
//            return 0;
//        } else if (emp1.id < emp2.id) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }
//}
}

    class NameSurnameComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            int res = emp1.name.compareTo(emp2.name);
            if (res == 0) {
                res = emp1.surname.compareTo(emp2.surname);
            }
            return res;
        }
    }

    class SalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.salary - emp2.salary;
        }
    }
