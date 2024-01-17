package TaskException;

import java.util.Scanner;

public class NotInteger {
    static void notIntegerException(Scanner scan) {
        try {
            int result = scan.nextInt();
            System.out.println(result * result);
        } catch (Exception e) {
            System.out.println(e + "(Введите целое число!)");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NotInteger.notIntegerException(scanner);
    }
}
