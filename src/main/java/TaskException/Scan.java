package TaskException;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        try {
            System.out.println("Введите текст, и прожмите Enter:");
            Scanner scanner = new Scanner(System.in);

            String st = scanner.nextLine();
            File file = new File("C:\\Java\\hey.txt");
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(st.getBytes());

            System.out.println("Файл создан, и записан!");

            /*BufferedReader in = new BufferedReader(new FileReader("C:\\Java\\hi.txt"));
            String line = in.readLine();
            while(line != null)
            {
                System.out.println(line);
                line = in.readLine();
            }
            in.close();*/

            /*FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            String content = "This is the content to write into create file";
            bw.write(content);
            bw.close();*/
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
