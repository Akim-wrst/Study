package p4.p5;
import static p1.p2.B.*;
public class E {
    public static String statistic (double rad1) {
        String result = "Радиус круга - " + rad1;
        double R1 = pi * rad1 * rad1;
        String result1 = "Площадь круга - " + R1;
        double R =2 * pi *rad1;
        String result2 = "Длина круга - " + R;
        String resultF = result + "  " + result1 + "  " + result2;
        return resultF;
    }
}
