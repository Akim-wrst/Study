package Generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    static void info(List<?> list) {
        System.out.println(list);
    }

    static double summ(ArrayList<? extends Number> al) {
        double summ = 0;
        for (Number n : al) {
            summ += n.doubleValue();
        }
        return summ;
    }

    public static void main(String[] args) {

        List<? extends Number> list10 = new ArrayList<Integer>();
        List<? super Number> list20 = new ArrayList<Object>();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        info(list);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(1.245);
        ald.add(2.3567);
        ald.add(3.5564);
        System.out.println(summ(ald));

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(10);
        ali.add(20);
        ali.add(30);
        System.out.println(summ(ali));
    }
}
