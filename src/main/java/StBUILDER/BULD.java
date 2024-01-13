package StBUILDER;

class BULD {

    static boolean ravenstvo(StringBuilder sb, StringBuilder sb1) {
        String S = new String(sb);
        String S1 = new String(sb1);
        return S.equals(S1);
    }
}

class bulTest {
    public static void main(String[] args) {

        System.out.println(BULD.ravenstvo(new StringBuilder("sdsd"), new StringBuilder("sdsd")));
    }
}

