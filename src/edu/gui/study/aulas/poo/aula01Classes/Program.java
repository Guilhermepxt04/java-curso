package edu.gui.study.aulas.poo.aula01Classes;

import edu.gui.study.aulas.poo.aula01Classes.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double aX = sc.nextDouble();
        double bX = sc.nextDouble();
        double cX = sc.nextDouble();

        double aY = sc.nextDouble();
        double bY = sc.nextDouble();
        double cY = sc.nextDouble();

        // criando variavel do tipo personalizado e instanciandoo objeto
        Triangle x, y;
        x = new Triangle(aX, bX, cX);
        y = new Triangle(aY, bY, cY);

        System.out.printf("Area do triangulo X: %.2f%n", x.Area());
        System.out.printf("Area do triangulo Y: %.2f", y.Area());

        sc.close();
    }

}
