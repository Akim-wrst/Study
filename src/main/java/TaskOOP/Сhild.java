package TaskOOP;

class Child extends Parent {
    @Override
    public double Sum(double value1, double value2) {
        return value1 * value2;
    }

    @Override
    public int SumString(String st) {
        String value = String.valueOf(st.charAt(0));
        String value2 = String.valueOf(st.charAt(1));
        int result = Integer.parseInt(value);
        int result2 = Integer.parseInt(value2);
        return result * result2;
    }

    @Override
    public String string(String st) {
        String result = String.valueOf(st.charAt(0));
        return result;
    }

    Child() {
        System.out.println("I am Child");
    }

    @Override
    public String subString(String st, String st2) {
        String res = st + st2;
        int central = res.length() / 2;
        return res.substring(0, central);
    }
}
