package TaskOOP;

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
