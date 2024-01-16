package TaskCollection;

import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    static void studentList(List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }

    static void studentAge(List<Student> list, int age) {
        for (Student student : list) {
            if (age < student.age) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Akim", 25);
        Student student2 = new Student("Sergey", 27);
        Student student3 = new Student("Gorg", 35);
        Student student4 = new Student("Dany", 18);
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        Student.studentList(students);
        System.out.println("-----------------------------------------");
        Student.studentAge(students, 26);
    }
}
