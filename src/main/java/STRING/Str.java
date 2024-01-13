package STRING;

class Str {
    void mail(String st) {
        int i = 0;
        int a;
        int b;
        while (i < st.length()-1) {

            a = st.indexOf('@', i);
            b = st.indexOf('.', i);
            i = st.indexOf(';', i + 1);

            System.out.println(st.substring(a + 1, b));
        }
    }

}
class StrTest {
    public static void main(String[] args) {
        Str User = new Str();
        User.mail("Akim@gmail.com; Dasha@yandex.com; Sanya@mail.ru;");
    }
}