package edu.gui.study.aulas.introducao;

import java.util.Scanner;

public class Aula05EstruturaCondicional {

    public static void main(String[] args) {

        //estrutura if else

        System.out.print("Que horas são?: ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x < 12) {
            System.out.println("Bom dia");
        }
        else if (x < 18) {
            System.out.println("Boa tarde");
        }
        else {
            System.out.println("Boa noite");
        }

        // Switch-case

        int y = sc.nextInt();
        String dia = switch (y) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sabado";
            default -> "Valor invalido";
        };

        System.out.println("Dia da semana: " + dia);
        sc.close();

        // Expressao condicional ternaria

        String z = (5 < 10) ? "Maria" : "Alex";
        System.out.println(z);

    }
}

