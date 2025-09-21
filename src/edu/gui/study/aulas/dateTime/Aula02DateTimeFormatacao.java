package edu.gui.study.aulas.dateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Aula02DateTimeFormatacao {

    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT;


        System.out.println("do1 = " + d01.format(fmt01));
        System.out.println("do1 = " + fmt01.format(d01));
        System.out.println("do1 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("do2 = " + d02.format(fmt01));
        System.out.println("do2 = " + d02.format(fmt02));
        System.out.println("do2 = " + d02.format(fmt04));

        System.out.println("d03 = " + fmt03.format(d03));
        System.out.println("d03 = " + fmt05.format(d03));

    }
}
