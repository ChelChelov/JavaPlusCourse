package generics.game;

public class Test {
    public static void main(String[] args) {
        Scholar scholar1 = new Scholar("Oleg", 12);
        Scholar scholar2 = new Scholar("Vasya", 13);

        Student student1 = new Student("Alex", 20);
        Student student2 = new Student("Alexandra", 22);

        Employee employee1 = new Employee("Mykhalych", 43);
        Employee employee2 = new Employee("Petrovich", 41);

        Team scholarTeam = new Team("Shkila");
        scholarTeam.addNewParticipant(scholar1);
        scholarTeam.addNewParticipant(scholar2);
    }
}
