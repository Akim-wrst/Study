package TaskException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputException {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Java\\hi.txt"));
            String line = in.readLine();
            while (line != null) {
                System.out.println(line);
                line = in.readLine();
            }
            in.close();
        } catch (IOException io) {
            System.out.println(io);
        }
    }
}
