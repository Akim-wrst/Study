package Generics_Game;

class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);

        Schoolar schoolar3 = new Schoolar("kolya", 14);
        Schoolar schoolar4 = new Schoolar("Olya", 11);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniya", 18);

        Employee employee1 = new Employee("Akim", 25);
        Employee employee2 = new Employee("Dasha", 27);

        Team<Schoolar> skhoolarTeam = new Team("Dragon");
        skhoolarTeam.addNewParticipant(schoolar1);
        skhoolarTeam.addNewParticipant(schoolar2);

        Team<Student> studentTeam = new Team<>("Go");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Rabotyagi");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Ptica");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        skhoolarTeam.playWitch(schoolarTeam2);
    }
}
