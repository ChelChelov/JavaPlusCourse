package generics.game;

public class Test {
    public static void main(String[] args) {
        Scholar scholar1 = new Scholar("Oleg", 12);
        Scholar scholar2 = new Scholar("Vasya", 13);

        Student student1 = new Student("Alex", 20);
        Student student2 = new Student("Alexandra", 22);

        Employee employee1 = new Employee("Mykhalych", 43);
        Employee employee2 = new Employee("Petrovich", 41);

        Team<Scholar> scholarTeam = new Team<>("Shkila");
        scholarTeam.addNewParticipant(scholar1);
        scholarTeam.addNewParticipant(scholar2);

        Team<Student> studentTeam = new Team<>("Unik");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Zavod");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);


        Scholar scholar3 = new Scholar("Jeka", 13);
        Scholar scholar4 = new Scholar("Lyudka", 12);

        Team<Scholar> scholarTeam2 = new Team<>("Magi");
        scholarTeam2.addNewParticipant(scholar3);
        scholarTeam2.addNewParticipant(scholar4);

        scholarTeam.playWith(scholarTeam2);
    }
}
