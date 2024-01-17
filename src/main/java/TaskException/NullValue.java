package TaskException;

public class NullValue {

    static void nullValueException(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (NullPointerException npe) {
            if (b == 0) {
                System.out.println(npe);
            }
        }
    }

    public static void main(String[] args) {
        NullValue.nullValueException(20, 0);

    }
}
