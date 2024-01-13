package lyambda_Predicate_Comparable_Comparator;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
    String name;
    String department;
    int salary;

    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {
    static void printEmployee(Employee devoloper) {
        System.out.println(devoloper.name + " " + devoloper.department + " " + devoloper.salary);
    }

    void filtraciyaRabotnikov(ArrayList<Employee> aL, Predicate<Employee> p) {
        for (Employee s : aL) {
            if (p.test(s))
                printEmployee(s);
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> List = new ArrayList<>();
        Employee devoloper1 = new Employee("Akim", "IT", 300);
        Employee devoloper2 = new Employee("Erema", "developer", 320);
        Employee devoloper3 = new Employee("Ermash", "Ermash", 450);
        List.add(devoloper1);
        List.add(devoloper2);
        List.add(devoloper3);

        TestEmployee te = new TestEmployee();

        te.filtraciyaRabotnikov(List, govno -> govno.salary > 200 && govno.department.equals("IT"));
        System.out.println("-----------------------------------------------------------------");
        te.filtraciyaRabotnikov(List, Employee -> Employee.name.indexOf('E') == 0 && Employee.salary != 450);
        System.out.println("-----------------------------------------------------------------");
        te.filtraciyaRabotnikov(List, Employee -> Employee.name.equals(Employee.department));
    }
}
