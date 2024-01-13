package Polimorf_Get_Set;

class Animal {
    int eyes;

    Animal() {
        System.out.println("i am animal");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    Pet() {
        System.out.println("i am pet");
        eyes = 2;
    }

    String name;
    int tail = 1;
    int paw = 4;

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {
    Dog(String n) {
        name = n;
        System.out.println("i am dog my name is - " + name);
    }

    void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {
    Cat(String n) {
        name = n;
        System.out.println("i am cat my name is - " + name);
    }

    void sleeps() {
        System.out.println("Cat sleeps");
    }
}

class AnimalTest {
    public static void main(String[] args) {
        Dog d = new Dog("barbos");
        System.out.println("кол-во лап у собаки - " + d.paw);
        System.out.println();
        Cat c = new Cat("tyapa");
        c.sleeps();
    }
}

