package TaskCollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student2 {
    String name;
    int attendance;

    public Student2(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", attendance=" + attendance +
                '}';
    }

    static void minAttendance(List<Student2> sts) {
        List<Integer> l = new ArrayList<>();
        for (Student2 st : sts) {
            int i = st.attendance;
            l.add(i);
        }
        int sum = l.stream().min((x, y) -> x - y).get();
        for (Student2 st : sts) {
            if (sum == st.attendance) {
                System.out.println(st);
            }
        }
    }

    static double average(List<Student2> sts) {
        List<Integer> l = new ArrayList<>();
        for (Student2 st : sts) {
            int i = st.attendance;
            l.add(i);
        }
        double counter = 0;
        double result = 0;
        for (double i : l) {
            result += i;
            counter ++;
        }
        return result / counter;
    }

    public static void main(String[] args) {
        Student2 st = new Student2("Akim", 20);
        Student2 st2 = new Student2("Vadim", 10);
        Student2 st3 = new Student2("Vladimir", 40);
        Student2 st4 = new Student2("Roma", 20);
        List<Student2> sts = new ArrayList<>();
        sts.add(st);
        sts.add(st2);
        sts.add(st3);
        sts.add(st4);
        Student2.minAttendance(sts);
        System.out.println("----------------------------------------------");
        System.out.println(Student2.average(sts));
    }
}
