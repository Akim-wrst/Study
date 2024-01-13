package Polimorf_Get_Set;

//Аллилуя нахуй
public class Student {
    private StringBuilder name;

    public StringBuilder getName() {
        return new StringBuilder(name);
    }

    public void setName(StringBuilder s) {
        if (s.length() > 2) {
            this.name = s;
        } else {
            System.out.println("Имя < 3-х символов");

        }
    }

    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int i) {
        if (i > 0 && i < 5) {
            course = i;
        } else {
            System.out.println("Курс 1-4");
        }
    }

    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int i) {
        if (i > 0 && i < 11) {
            grade = i;
        } else {
            System.out.println("бал 1-10");
        }
    }

    public void showinfo(StringBuilder setName, int setCourse, int grade1) {
        setName(setName);
        setCourse(setCourse);
        setGrade(grade1);
        System.out.println("Студент - " + getName() + "\n" + "Курс: " + getCourse() + "\n" + "Бал: " + getGrade());
    }

}

class StudentTest {
    public static void main(String[] args) {
        Student A = new Student();
        A.showinfo(new StringBuilder("Akim"), 1, 10);
    }
}
