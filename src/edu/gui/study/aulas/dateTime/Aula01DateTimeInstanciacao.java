package edu.gui.study.aulas.dateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aula01DateTimeInstanciacao {

    // Link sobre DateTimeFormatter
    // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

    public static void main(String[] args) {

        // formatos de texto para converter com metodo parse
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        LocalDate d01 = LocalDate.now(); // apenas data local
        LocalDateTime d02 = LocalDateTime.now(); // data com horario local
        Instant d03 = Instant.now(); // data hora global

        LocalDate d04 = LocalDate.parse("2022-07-20"); // data local convertida a partir dessa string
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // data hora local a partir dessa string
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // data hora global a partir dessa string com GMT de londres
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); // data hora global a partir dessa string com GMT de SP

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt01);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt02);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 22, 1, 30);


        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08.format(fmt01));
        System.out.println("d09 = " + d09.format(fmt02));
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

    }
}
