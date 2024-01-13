package Generics;

class Parametrized_class {
    public static void main(String[] args) {
        OtherPair<Integer> otherPair = new OtherPair<>(1, 2);
        System.out.println(otherPair.getFirstValue() + " " + otherPair.getSecondValue());
        System.out.println(otherPair.abc(0));
    }
}

class OtherPair<V> {
    private V value1;
    private V value2;

    public V abc(V val) {
        return val;
    }

    OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    V getFirstValue() {
        return value1;
    }

    V getSecondValue() {
        return value2;
    }
}
