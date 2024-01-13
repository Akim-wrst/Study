package Generics;

import java.lang.reflect.Type;
import java.util.ArrayList;

class Parametrized_method {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(5);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("sdsd");
        al2.add("dfgf");
        al2.add("fgfgh");
        String a2 = GenMethod.getSecondElement(al2);
        System.out.println(a2);
    }
}
class GenMethod {
    public static <T /*extends Number*/> T getSecondElement(ArrayList<T> al) {
        return al.get(0);
    }
}

