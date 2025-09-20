package edu.gui.study.exercicios.colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Nesse exercicio o usuario deve passar um tamanho N para criar uma matriz
 * de numeros inteiros, em seguida mostrar a diagonal principal e a quantidade
 * de valores negativos na matriz
 **/

public class Matriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int totalNegativos = 0;

        List<Integer> diagonal = new ArrayList<>();
        int[][] matriz = new int[n][n];

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < matriz[y].length; x++) {

                int numero = sc.nextInt();
                matriz[y][x] = numero;

                if (y == x) {
                    diagonal.add(numero);
                }
                if (numero < 0) {
                    totalNegativos += 1;
                }
            }
        }

        System.out.println("Diagonal Principal: ");
        for (int x : diagonal) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
        System.out.println("Numeros Negativos: " + totalNegativos);

        sc.close();
    }
}
