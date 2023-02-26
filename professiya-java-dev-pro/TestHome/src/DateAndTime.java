import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class DateAndTime {
    static void dateAndTime() {
        Date now = new Date();
        System.out.println("Текущая дата: " + now);

        LocalDate today = LocalDate.now();
        System.out.println(today + " - тут показывает сегодняшнюю дату!");

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2 + " - тут показывает сегодняшнюю дату и время!");

        LocalDate birthDay = LocalDate.of(1984, 8, 5);
        System.out.println(birthDay + " - тут установили эту дату!");
        System.out.println(birthDay.plusYears(38) + " - будет через 38 лет ");

        //TODO https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
        LocalDateTime nowNY = LocalDateTime.now(ZoneId.of("Canada/Newfoundland"));
        System.out.println(nowNY + " - Время в Канаде - Нью Фаундленд");
        LocalDateTime nowSakha = LocalDateTime.now(ZoneId.of("Asia/Yakutsk"));
        System.out.println(nowSakha + " - Время в Якутске");

        System.out.println("\n========Преобразование строки в дату========\n");
        String date = "03/10/2021";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);

        System.out.println("\n========Преобразование даты в строку========\n");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:SSSSSSSSS"); //max 9 - S
        LocalDateTime now3 = LocalDateTime.now();
        System.out.println(formatter2.format(now3));

        System.out.println("\n==Краткий и средний вариант даты и времени==\n");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).localizedBy(new Locale("ru"));
        DateTimeFormatter formatter4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).localizedBy(new Locale("ru"));
        LocalDateTime now4 = LocalDateTime.now();
        System.out.println(formatter3.format(now4));
        System.out.println(formatter4.format(now4));

        System.out.println("\n==========Сравнение даты и времени==========\n");
        LocalDateTime time1 = LocalDateTime.now();
        LocalDateTime time2 = LocalDateTime.now().minusDays(2);
        System.out.println(time1);
        System.out.println(time2);
        if (time1.isAfter(time2)) {
            System.out.println("time1 is after time2");
        }
        System.out.println(time1.compareTo(time2) + " - сравнение");
        System.out.println(time1.until(time2, ChronoUnit.HOURS) + " - разница в часах");
    }
}