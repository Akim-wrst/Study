package DATA_TIME;
import java.time.*;
import java.time.format.*;

class DT {
    DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("HH:mm, dd/MM/yy");

    void smena(LocalDateTime nachalo, LocalDateTime konec, Period p, Duration d) {
        LocalDateTime ldt = nachalo;
        while (ldt.isBefore(konec)) {
            System.out.println("Работаем с: " + ldt.format(f));
            ldt = ldt.plus(p);
            System.out.println("до " + ldt.format(f));
            System.out.println("Отдыхаем с:" + ldt.format(f2));
            ldt = ldt.plus(d);
            System.out.println(" До: " + ldt.format(f2));
        }
    }
    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.of(2016,01,01,9,0,0);
        LocalDateTime date2 = LocalDateTime.of(2016,10,31,18,0,0);
        Period p = Period.of(0,1,2);
        Duration d = Duration.ofMinutes(600);
        DT pzdc = new DT();
        pzdc.smena(date1, date2, p, d);
    }
}
