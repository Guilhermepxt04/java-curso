package edu.gui.study.aulas.colecoes.aula02Arrays;

import edu.gui.study.aulas.colecoes.aula02Arrays.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double totalPrice = 0.0;

        System.out.println("Quantos produtos você vai digitalizar?: ");
        int n = sc.nextInt();

        Product[] products = new Product[n];

        for (int i=0; i<products.length; i++) {

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            products[i] = new Product(name, price);
            totalPrice += products[i].getPrice();
        }

        double average = totalPrice / n;
        System.out.println("Average Price: R$" + String.format("%.2f", average) );

    }
}
