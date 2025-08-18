package edu.gui.study.aulas.introducao;

import java.util.Locale;
import java.util.Scanner;

public class Aula06EstruturaRepetitiva {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int soma = 0;
        int x = sc.nextInt();

        // While

        while (x != 0) {

            soma += x;
            x = sc.nextInt();

        }

        System.out.println(soma);
        soma = 0;

        // for

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int numero = sc.nextInt();
            soma += numero;

        }

        System.out.println(soma);


        // do-while

        char resp;
        do {
            System.out.print("digite a temperatura em celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
            System.out.println("Equivalente em Fahrenheit: " + fahrenheit);
            System.out.print("Deseja continuar?: ");
            resp = sc.next().charAt(0);
        } while (resp == 's');

        sc.close();
    }

}
