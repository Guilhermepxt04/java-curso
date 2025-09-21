package edu.gui.study.aulas.dateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aula05DateTimeCalculos {

    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        System.out.println(pastWeekLocalDate);

    }

}
