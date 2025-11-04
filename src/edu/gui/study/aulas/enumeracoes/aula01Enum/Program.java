package edu.gui.study.aulas.enumeracoes.aula01Enum;

import edu.gui.study.aulas.enumeracoes.aula01Enum.entities.Order;
import edu.gui.study.aulas.enumeracoes.aula01Enum.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String status = sc.nextLine();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Order order = new Order(1080, LocalDate.parse("02/10/2025", fmt), OrderStatus.valueOf(status));

        System.out.println(order);
    }
}
