package NestedClass;

class NestedClasses {
    String color;
    int doorCount;
    Engine engine;

    //NestedClasses(String color, int doorCount, Engine engine) { // Engine engine если эта переменная в статик методе
    NestedClasses(String color, int doorCount, int power) {
        this.color = color;
        this.doorCount = doorCount;
        //this.engine = engine; // если эта переменная в статик методе
        this.engine = new Engine(power);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    //static class Engine { //  static nested class. Может быть абстрактным, и может обращатся к приватным статик элементам суперкласса.
    class Engine { // INNER class
        int power;
        static int countofObjects;

        Engine(int power) {
            this.power = power;
            countofObjects++;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "power=" + power +
                    '}';
        }

    }

    void method() {
        class C {
        } // LOCAL class, вложенный в метод
    }
}
/*class Z extends NestedClasses.Engine {
    Z(int power) {
        super(power);
    }
}*/ // класс может наследовать нестед класс, как и нестед класс может наследовать любой другой класс

class Test {
    public static void main(String[] args) {
        //NestedClasses.Engine engine = new NestedClasses.Engine(4);
        //System.out.println(engine);
        //NestedClasses Car = new NestedClasses("Blue", 4, power);
        NestedClasses Car = new NestedClasses("Blue", 4, 421);
        /*Car.Engine engine = Car.new Engine(150);
        Car.setEngine(engine);*/
        System.out.println(Car);
        NestedClasses Car2 = new NestedClasses("Read", 2, 780);
        System.out.println(Car2);
        int countofObjects = NestedClasses.Engine.countofObjects;
        System.out.println(countofObjects);
    }
}

