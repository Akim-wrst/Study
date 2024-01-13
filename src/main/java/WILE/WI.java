package WILE;

public class WI {
    public static void main(String[] args) {
        int chas = 0;
        OUTER:
        while (chas < 6) {
            int min = -1;
            chas++;

            MIDDLE:
            do {
                int sec = 0;
                min++;
                if (chas == 1 && min == 10) {
                    break OUTER;
                }

                INNER:
                while (sec < 60) {
                    //sec++;
                    if ((sec * chas) > min) {
                        continue MIDDLE;
                    }

                    System.out.println(chas + ":" + min + ":" + sec);
                    sec++;
                }

            } while (min < 60);

        }
    }
}


