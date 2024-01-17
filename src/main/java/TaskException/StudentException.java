package TaskException;

import java.util.ArrayList;

class stException extends Exception {
    stException(String s) {
        super(s);
    }
}

public class StudentException {
    static void addStudent(ArrayList<String> list, String student) {
        try {
            for (String st : list) {
                if (st.equals(student)) {
                    throw new stException("Такой студент уже есть");
                }
            }
            list.add(student);
            System.out.println(list);
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        StudentException.addStudent(list, "Akim");
        StudentException.addStudent(list, "Akim");
    }
}
