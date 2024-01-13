package EQUALS_HASHCODE;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

final class Student implements Comparable<Student> {
    @Override
    public int compareTo(@NotNull Student o) {
        return this.name.compareTo(o.name);
    }

    private final String name;
    private final String surname;
    private final int course; //защита для хэшмап, если меняется значение меняется и хэшкод

    Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}

class Test {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Ikim", "Parish", 1);
        Student st2 = new Student("Daria", "Parish", 5);
        Student st3 = new Student("Banya", "Sobolev", 6);
        map.put(st1, 33.3);
        map.put(st2, 55.10);
        map.put(st3, 30.23);
        System.out.println(map); //Выдает параметры обьекта из-за оверайда toString
        //st2.course = 4; //защита для хэшмап, если меняется значение меняется и хэшкод
        Student st4 = new Student("Akim", "Parish", 1);
        System.out.println(map.containsKey(st4)); //true из-за оверайда hashCode

        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode()); //Можно сделать одинаковым через оверайд hashCode
    }
}
