package edu.gui.study.aulas.poo.aula03Estaticos;

import edu.gui.study.aulas.poo.aula03Estaticos.utils.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter radius: ");
        Double radius = sc.nextDouble();

        System.out.println(Calculator.circumferencia(radius));
        System.out.println(Calculator.volume(radius));
        System.out.println(Calculator.PI);

        sc.close();
    }

}
