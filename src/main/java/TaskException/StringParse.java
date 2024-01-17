package TaskException;

public class StringParse {
    static void stringParseInt(String st) {
        try {
            int result = Integer.parseInt(st);
            System.out.println(st);
        } catch (Exception e) {
            System.out.println(e + "(Невозможно преобразовать в int)");
        }
    }

    public static void main(String[] args) {
        StringParse.stringParseInt("sdsd");

    }
}

