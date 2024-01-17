package TaskException;

class IgnitionException extends Exception {
    IgnitionException(String s) {
        super(s);
    }
}

public class Car {
    private static int Alfa = 0;

    static void ignition(int i) {
        try {
            if (Alfa == 1) {
                throw new IgnitionException("Двигатель уже рабоатет");
            }
            Alfa += 1;
            System.out.println("Двигатель запущен");
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Car.ignition(1);
        Car.ignition(1);


    }
}

