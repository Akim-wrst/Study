package abstract_instanceof;

abstract class Animal {
    Animal(String name) {
        this.name = name;
    }

    String name;

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
        this.name = name;
    }

    void sleep() {
        System.out.println("Vsegda interesno nabludat, kak spyat ribi");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {

    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    void Speak(String name) {
        System.out.println(name + "Sings");
    }
}

abstract class Mammal extends Animal implements Speakable {
    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

interface Speakable {
    default void Speak() {
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish {

    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    void swim() {
        System.out.println("Mechenocec krasivaya riba, заебал ты с этитми текстами");
    }

    void eat() {
        System.out.println("Натуре заебал");
    }
}

class Pingvin extends Bird {
    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    public void Speak() {
        System.out.println("Пингвины, не поют ебать!");
    }

    @Override
    void fly() {
        System.out.println("Не летают, блять");
    }

    @Override
    void eat() {
        System.out.println("Любит жрать рыбу");
    }

    @Override
    void sleep() {
        System.out.println("Спят к друг другу");
    }
}

class Lev extends Mammal {
    Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void run() {
        System.out.println("Короли не бегаеют");
    }

    @Override
    void eat() {
        System.out.println("Хищник ебать");
    }

    @Override
    void sleep() {
        System.out.println("Спит дохуя");
    }
}

class AnimalTest {
    public static void main(String[] args) {
        Animal F = new Mechenosec("Kari");
        Fish Fis = new Mechenosec("Kari");
        Mechenosec m = new Mechenosec("Kari");
        //Speakable mCasting = (Speakable) new Mechenosec("Kari");
        /*System.out.println(m.name);
        m.eat();
        m.swim();
        m.sleep();
        System.out.println();*/
        Animal B = new Pingvin("Kavalski");
        Bird Bir = new Pingvin("Kavalski");
        Pingvin p = new Pingvin("Kavalski");
        Speakable pSSS = new Pingvin("Kavalski");
        /*pSSS.Speak();
        System.out.println();*/
        Mammal Mam = new Lev("Lev");
        Speakable LSSS = new Lev("Lev");
        /*System.out.println(Mam.name);
        Mam.Speak();
        Mam.run();
        Mam.eat();
        Mam.sleep();
        System.out.println();*/
        Animal L = new Lev("Lev");
        Lev l = new Lev("Lev");
        /*System.out.println(L.name);
        L.eat();
        L.sleep();*/

        Speakable[] arrayS = new Speakable[]{Bir, pSSS, LSSS, Mam};
        for (Speakable S : arrayS) {
            if (S instanceof Pingvin) {
                System.out.println(p.name);
                p.Speak();
                p.eat();
                p.fly();
                p.sleep();
            } else if (S instanceof Lev) {
                System.out.println(L.name);
                L.eat();
                L.sleep();
            }

        }
        System.out.println("---------------------------------------------------------------------");

        Animal[] arrayA = new Animal[]{F, L, Fis, Mam, m, l};
        for (Animal A : arrayA) {
            if (A instanceof Lev) {
                System.out.println(Mam.name);
                Mam.eat();
                Mam.sleep();
            } else if (A instanceof Mechenosec) {
                System.out.println(m.name);
                m.eat();
                m.sleep();
                m.swim();
            }
        }

    }
}