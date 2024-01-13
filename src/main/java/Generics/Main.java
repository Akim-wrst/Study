package Generics;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("sdsd");
        list.add("Sdsdsdsds");
        list.add("gdsgfdg");
        list.add("fdgfdhgfghg");

        for (Object o : list)
            System.out.println(o + " - dlina: " + ((String) o).length());
    }
}
