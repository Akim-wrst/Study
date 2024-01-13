package FOR;

class FFOR {
    public static void main(String[] args) {

        OUTER:
        for (int chas = 0; chas <= 6; chas++) {

            MIDDLE:
            for (int minuta = 0; minuta <= 59; minuta++) {

                if (chas == 1 && minuta == 10) {
                    break OUTER;
                }

                INNER:
                for (int sec = 0; sec <= 60; sec++) {

                    if ((sec * chas) > minuta) {
                        continue MIDDLE;
                    }

                    System.out.println(chas + ":" + minuta + ":" + sec);
                }
            }
        }
    }
}

