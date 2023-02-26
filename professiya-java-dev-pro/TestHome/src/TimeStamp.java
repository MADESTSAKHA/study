import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class TimeStamp {
            //Штамп времени
            static void timestamp() {
        System.out.println("Метка времени - Количество секунд, прошедших с 00:00:00 от 01 января 1970 года\n");
        System.out.println("============Текущая метка времени===========\n");

        long start = System.currentTimeMillis();
        System.out.println(start + " - текущее время");

        String line = "";
        for (int i = 0; i < 1000; i++) {
            line += Math.random();
        }
        System.out.println(System.currentTimeMillis() - start + " - Сколько миллисекунд выполнялась программа");

        System.out.println("\n====Преобразование метки времени в дату===\n");

        LocalDateTime now2 = LocalDateTime.ofEpochSecond(System.currentTimeMillis() / 1000, 0, ZoneOffset.ofHours(9));
        System.out.println(now2 + " - время в часовой зоне +9");

        System.out.println("\n==========Метка времени из даты===========\n");

        LocalDateTime now3 = LocalDateTime.now();
        System.out.println(now3.toEpochSecond(ZoneOffset.ofHours(9)) + " - Текущая метка времени в секундах, в часовой зоне +9");
    }
}
