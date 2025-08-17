package edu.gui.study.aulas.introducao;

import java.util.Locale;
import java.util.Scanner;

public class Aula03Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        int x = sc.nextInt();
        sc.nextLine(); // responsavel por consumir a quebra de linha pendente da linha anterior para que o proximo scanner leia a entrada
        // do usuario
        String nome = sc.nextLine();
        double y = sc.nextDouble();
        char z = sc.next().charAt(0);

        System.out.println(x);
        System.out.println(nome);
        System.out.printf("%.2f%n", y);
        System.out.println(z);

        sc.close();

    }

}
