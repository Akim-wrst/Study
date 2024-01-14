package TaskOOP;

class Parent {
    public double Sum(double value1, double value2) {
        return value1 + value2;
    }

    public int SumString(String st) {
        String value = String.valueOf(st.charAt(0));
        String value2 = String.valueOf(st.charAt(1));
        int result = Integer.parseInt(value);
        int result2 = Integer.parseInt(value2);
        return result + result2;
    }

    public String string(String st) {
        return st;
    }

    Parent() {
        System.out.println("I am Parent");
    }

    public String subString(String st, String st2) {
        return st + st2;
    }
}

class Child extends Parent {
    @Override
    public double Sum(double value1, double value2) {
        return value1 * value2;
    }

    @Override
    public int SumString(String st) {
        String value = String.valueOf(st.charAt(0));
        String value2 = String.valueOf(st.charAt(1));
        int result = Integer.parseInt(value);
        int result2 = Integer.parseInt(value2);
        return result * result2;
    }

    @Override
    public String string(String st) {
        String result = String.valueOf(st.charAt(0));
        return result;
    }

    Child() {
        System.out.println("I am Child");
    }

    @Override
    public String subString(String st, String st2) {
        String res = st + st2;
        int central = res.length() / 2;
        return res.substring(0, central);
    }
}

class Child2 extends Parent {
    public double Sum(double value1, double value2, double value3) {
        return value1 + value2 + value3;
    }

    public int SumString(String st, String st2, String st3) {
        String value = String.valueOf(st.charAt(0));
        String value2 = String.valueOf(st2.charAt(0));
        String value3 = String.valueOf(st3.charAt(0));
        int result = Integer.parseInt(value);
        int result2 = Integer.parseInt(value2);
        int result3 = Integer.parseInt(value3);
        return result + result2 + result3;
    }

    public String string(String st, String st2) {
        return st + st2;
    }

    Child2(String st) {
        System.out.println("I am Child2" + st);
    }

    public String subString(String st, String st2, String st3) {
        return st + st2 + st3;
    }
}

abstract class Figure {
    static final double pi = 3.14;

    Figure(String name) {
        this.name = name;
    }

    String name;

    abstract void Square(double a, double b);
}

class Circle extends Figure {
    Circle(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void Square(double a, double b) {
        System.out.println(pi * a * b);
    }
}

class Rectangle extends Figure {
    Rectangle(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void Square(double a, double b) {
        System.out.println(a * b);
    }
}

class Triangle extends Figure {
    Triangle(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void Square(double a, double b) {
        System.out.println((a / 2) * b);
    }
}

abstract class Employee {
    Employee(String name) {
        this.name = name;
    }

    String name;

    abstract void Work();

}

class Manager extends Employee {
    Manager(String name) {
        super(name);
    }

    @Override
    void Work() {
        System.out.println("Управляет проектами");
    }
}

class WarehouseWorker extends Employee {
    WarehouseWorker(String name) {
        super(name);
    }

    @Override
    void Work() {
        System.out.println("Заполняет накладную, и ведет учет");
    }
}


