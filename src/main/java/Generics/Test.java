package Generics;

import java.util.ArrayList;
import java.util.List;

class Test {
    public static void main(String[] args) {

     /*   List<Number> list = new ArrayList<>();
        list.add(18);
        list.add(3.15);*/
        info<Integer> i = new info<>(18);
        System.out.println(i);
        Integer i11 = i.getValue();

        info<Double> i2 = new info<>(2.3);
        System.out.println(i2);
        Integer i22 = i.getValue();
    }
    /*void abc (info<Integer> info) {
        Integer i = info.getValue();
    }
    void abc (info<String> info) {
        String i = info.getValue();
    }*/

}
class info<T extends Number/*&I1&I2*/> {
    private T value;

    info(T value) {
        this.value = value;
    }
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}
/*interface I1{}
interface I2{}*/

/*
class Parrnt {
    void abc (info<Integer> info) {
        Integer i = info.getValue();
    }
}
class Child extends Parrnt {
    void abc (info<String> info) {
        String i = info.getValue();
    }
}*/
