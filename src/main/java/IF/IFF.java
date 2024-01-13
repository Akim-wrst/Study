package IF;

class IFF {
    String name;
    int course;
    double grade;

    IFF(String name, int course, double grade, Object... obj) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    static void method(IFF st1, IFF st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Одинаковые");
        } else {
            System.out.println("ИДИ НАХУЙ");
        }
    }

    static void method2(IFF st1, IFF st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Одинаковые");
                } else {
                    System.out.println("разный грейд");
                }
            } else {
                System.out.println("разынй курс");
            }
        } else {
            System.out.println("IDI NAXYI");
        }
    }

}

class ifTest {

    public static void main(String[] args) {
        IFF st1 = new IFF("Ivan", 3, 9.5, 2.4, 15, "sdssd");
        IFF st2 = new IFF("van", 4, 10.5);
        IFF.method(st1, st2);
        IFF.method2(st1, st2);
    }
}
