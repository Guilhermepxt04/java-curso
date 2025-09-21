package edu.gui.study.aulas.dateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aula04DateTimeObterDados {

    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");

        System.out.println(d01.getDayOfMonth());
        System.out.println(d01.getMonthValue());
        System.out.println(d01.getYear());

        System.out.println(d02.getHour());
        System.out.println(d02.getMinute());


    }
}
