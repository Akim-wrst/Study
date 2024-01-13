package Generics_Game;

abstract class Participant {

    private String name;

    private int age;

    Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}

