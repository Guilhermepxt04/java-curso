package edu.gui.study.aulas.dateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Aula05DateTimeCalculos {

    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);

        LocalDateTime pastHourLocalDateTime = d02.minusHours(1);
        LocalDateTime nextHourLocalDateTime = d02.plusHours(1);

        System.out.println(pastHourLocalDateTime);
        System.out.println(nextHourLocalDateTime);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println(pastWeekInstant);
        System.out.println(nextWeekInstant);

        Duration t1 = Duration.between(pastHourLocalDateTime, d02);
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
        Duration t3 = Duration.between(pastWeekInstant, d03);

        System.out.println(t1.toHours());
        System.out.println(t2.toDays());
        System.out.println(t3.toDays());

    }
}
