package StBUILDER;

class BUld2 {
    static boolean ravenstvo2(StringBuilder st, StringBuilder st1) {
        boolean result2 = true;
        if (st.length() == st1.length()) {
            for (int i = 0; i < st.length(); i++) {
                if (st.charAt(i) != st1.charAt(i)) {
                    result2 = false;
                    break;
                }
            }
        } else {
            result2 = false;
        }

        return result2;
    }
}

class BUldTest {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("sdsd");
        StringBuilder st1 = new StringBuilder("sdsd");

        System.out.println(BUld2.ravenstvo2(st, st1));
    }
}
