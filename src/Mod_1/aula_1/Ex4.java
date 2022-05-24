package Mod_1.aula_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex4 {
    private String birthday;
    private String today;

    public void howManyDays (String birthday, String today){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate date1 = LocalDate.parse(birthday, dtf);
        LocalDate date2 = LocalDate.parse(today, dtf);

        long totalDays = ChronoUnit.DAYS.between(date1, date2);

        System.out.println("Days = " + totalDays);

    }


}
