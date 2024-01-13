package ARRAYLIST;

import java.util.*;

class abcAR {
    static ArrayList<String> abc(String... a) {
        ArrayList<String> list = new ArrayList<>();
        for (String a1 : a) {
            if (!list.contains(a1)) {
                list.add(a1);
            }
        }
        Collections.sort(list);
        return list;
    }
}

class abcARTest {
    public static void main(String[] args) {
        System.out.println(abcAR.abc("ok", "privet", "pok", "ok", "privet", "pok"));
    }
}


