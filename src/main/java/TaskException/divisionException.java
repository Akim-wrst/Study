package TaskException;

class divisionException {
    static void division(Object obg, Object obg2) {
        try {
            int result = (Integer) obg / (Integer) obg2;
            System.out.println(result);
        }catch (Exception e) {
            System.out.println(e + "(Введите целочисленный тип переменной)");
        }
    }

    public static void main(String[] args) {
        divisionException.division(33,"sdsd");
    }
}
