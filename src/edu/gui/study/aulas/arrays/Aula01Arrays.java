package edu.gui.study.aulas.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Aula01Arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        double[] array = new double[n];
        double alturaTotal = 0;

        for (int i=0; i<array.length; i++) {

            array[i] = sc.nextDouble();
            alturaTotal += array[i];

        }

        double alturaMedia = alturaTotal / n;

        System.out.println("ALTURA MEDIA: " + String.format("%.2f", alturaMedia));

        sc.close();
    }
}
