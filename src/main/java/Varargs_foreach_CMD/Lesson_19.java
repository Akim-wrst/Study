package Varargs_foreach_CMD;

class Lesson_19 {

    static String[] abc2(String[]... array1) {
        int lenght = 0;
        for (String[] array2 : array1) {
            lenght += array2.length;
        }
        String[] target = new String[lenght];
        int count = 0;
        for (String[] array2 : array1) {
            for (String s : array2) {
                target[count] = s;
                count++;
            }
        }
        return target;
    }
}

class LessonTest {
    public static void main(String[] args) {
        String[] target = Lesson_19.abc2(new String[]{"ok", "privet", "poka"}, new String[]{"ok", "hello", "bay"});

        for (String s : args) {
            for (int i = 0; i < target.length; i++) {
                if (s.equals(target[i]))
                    target[i] = null;
            }
        }
        for (String s : target) {
            System.out.println(s + " ");
        }
        System.out.println();
    }
}


