package TaskException;

import java.io.*;

class FileException {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Java\\hi.txt");
            FileOutputStream fos = new FileOutputStream(file);
            fos.write("This is the content to write into create file".getBytes());

            /*BufferedReader in = new BufferedReader(new FileReader("C:\\Java\\hi.txt"));
            String line = in.readLine();
            while (line != null) {
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
