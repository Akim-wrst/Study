package TaskOOP;

class Child2 extends Parent {
    public double Sum(double value1, double value2, double value3) {
        return value1 + value2 + value3;
    }

    public int SumString(String st, String st2, String st3) {
        String value = String.valueOf(st.charAt(0));
        String value2 = String.valueOf(st2.charAt(0));
        String value3 = String.valueOf(st3.charAt(0));
        int result = Integer.parseInt(value);
        int result2 = Integer.parseInt(value2);
        int result3 = Integer.parseInt(value3);
        return result + result2 + result3;
    }

    public String string(String st, String st2) {
        return st + st2;
    }

    Child2(String st) {
        System.out.println("I am Child2" + st);
    }

    public String subString(String st, String st2, String st3) {
        return st + st2 + st3;
    }
}
