package lyambda_Predicate_Comparable_Comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

class TestCOMPARABLE {
    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();
        Employee2 devoloper1 = new Employee2(55, "Akim", "IT", 350);
        Employee2 devoloper2 = new Employee2(22, "Erema", "Developer", 320);
        Employee2 devoloper3 = new Employee2(33, "Dima", "Testerovshik", 450);
        list.add(devoloper1);
        list.add(devoloper2);
        list.add(devoloper3);

        Collections.sort(list, new NameComparator());
        System.out.println(list);
    }
}

public class Employee2 implements Comparable<Employee2> {
    int ID;
    String name2;
    String department2;
    //Integer salary;
    int salary2;

    Employee2(int ID, String name, String department, int salary) {
        this.ID = ID;
        this.name2 = name;
        this.department2 = department;
        this.salary2 = salary;
    }

    @Override
    public String toString() {
        return ID + " " + name2 + " " + department2 + " " + salary2;
    }

    @Override
    public int compareTo(Employee2 anotherEmp) {
        return this.salary2 - anotherEmp.salary2; // Сортировка по зарплате

        //return this.salary.compareTo(anotherEmp.salary); // Написание для Integer salary;

        //return this.name.compareTo(anotherEmp.name); // Сортировка по имени

        //Сортировка по имени, и департаменту!!!!
        /*int res = this.name.compareTo(anotherEmp.name);
        if(res == 0) {
            res = this.department.compareTo(anotherEmp.department);
        }
        return res;*/
    }
}

class NameComparator implements Comparator<Employee2> {

    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.name2.compareTo(o2.name2);
    }
}

class idComparator implements Comparator<Employee2> {

    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.ID - o2.ID;
    }
}

