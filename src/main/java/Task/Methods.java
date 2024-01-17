package Task;

import java.util.ArrayList;

class Methods {
    static double Sum(double value1, double value2) {
        return value1 + value2;
    }

    static String SumString(String st1, String st2) {
        return st1 + st2;
    }

    static String ValueString(String st, int value) {
        int valueString = Integer.parseInt(st);
        int Sum = valueString + value;
        return String.valueOf(Sum);
    }

    static boolean ValueStringBoolean(String st, int value) {
        int valueString = Integer.parseInt(st);
        if (valueString > value) {
            return false;
        } else {
            return true;
        }
    }

    static boolean Comparison(boolean compare, boolean compare2) {
        return compare || compare2;
    }

    static boolean ComparisonInt(int value) {
        return value % 2 == 0;
    }

    static ArrayList<Integer> NewArray(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return list;
    }

    static int SumIntArray2(int[] array) {
        int result = 0;
        for (int j : array) {
            result += j;
        }
        return result;
    }

    static void Age(int age) {
        int mount = age * 12;
        int hour = (mount * 30) * 24;
        int minute = hour * 60;
        System.out.println("Человек прожил" + " месяцев:" + mount + " часов:" + hour + " минут:" + minute);
    }

    static boolean ComparisonName(String name, String name2) {
        String copy = name.toUpperCase();
        String copy2 = name2.toUpperCase();
        return copy.equals(copy2);
    }

    static int lastIntArray(int[] array) {
        int result = array.length - 1;
        return array[result];
    }

    static int counterCharA(String st) {
        int result = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'A') {
                result++;
            }
        }
        return result;
    }

    static String EvenAndOddNumbers(int[] array) {
        int even = 0;
        int odd = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return (odd == 0) ? "Массив четных чисел" : (even == 0) ? "Массив нечетных чисел" : "Массив четных и не четных чисел";
    }
}

class Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Methods.Sum(1.2, 30) + "\n");
        System.out.println(Methods.SumString("SSD + ", "HDD") + "\n");
        System.out.println(Methods.ValueString("55", 5) + "\n");
        System.out.println(Methods.ValueStringBoolean("55", 5) + "\n");
        System.out.println(Methods.Comparison(true, false) + "\n");
        System.out.println(Methods.ComparisonInt(22) + "\n");
        System.out.println(Methods.SumIntArray2(array) + "\n");
        System.out.println(Methods.NewArray(array) + "\n");
        Methods.Age(62);
        System.out.println(Methods.ComparisonName("Akim", "akim") + "\n");
        System.out.println(Methods.lastIntArray(array) + "\n");
        System.out.println(Methods.counterCharA("AKIRA") + "\n");
        System.out.println(Methods.EvenAndOddNumbers(array));
    }
}

