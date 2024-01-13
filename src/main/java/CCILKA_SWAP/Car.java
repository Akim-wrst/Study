package CCILKA_SWAP;

class Car {
    String color;
    String motor;
    int kol_voDV;

    Car(String color, String motor, int kol_voDV, Object... obj) {
        this.color = color;
        this.motor = motor;
        this.kol_voDV = kol_voDV;
    }

    Car(String color) {
        this(color, null, 0);
    }

    void Swap(Car a, Car b) {
        Car c = new Car(null, null, 0);
        c.color = a.color;
        a.color = b.color;
        b.color = c.color;

        c.motor = a.motor;
        a.motor = b.motor;
        b.motor = c.motor;

        c.kol_voDV = a.kol_voDV;
        a.kol_voDV = b.kol_voDV;
        b.kol_voDV = c.kol_voDV;
    }
    /*public boolean equals (Object obj) {
        if (obj instanceof Car) {
            Car c2 = (Car) obj;
            return (color.equals(c2.color) && motor.equals(c2.motor));
        } else {
            return false;
        }
    }*/
}

class CarTest {
    public static void main(String[] args) {
        Car m1 = new Car("Red", "v6", 2, 222, 3.33, "sdsd");
        Car m2 = new Car("Green", "v8", 4);

        m2.Swap(m1, m2);

        System.out.println(m2.color + "\n" + m2.motor + "\n" + m2.kol_voDV);
        //System.out.println(m1.equals(m2));
    }
}
