package TaskOOP;

class Parent {
    public double Sum(double value1, double value2) {
        return value1 + value2;
    }

    public int SumString(String st) {
        String value = String.valueOf(st.charAt(0));
        String value2 = String.valueOf(st.charAt(1));
        int result = Integer.parseInt(value);
        int result2 = Integer.parseInt(value2);
        return result + result2;
    }

    public String string(String st) {
        return st;
    }

    Parent() {
        System.out.println("I am Parent");
    }

    public String subString(String st, String st2) {
        return st + st2;
    }
}


