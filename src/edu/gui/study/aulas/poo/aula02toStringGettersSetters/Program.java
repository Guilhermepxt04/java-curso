package edu.gui.study.aulas.poo.aula02toStringGettersSetters;

import edu.gui.study.aulas.poo.aula02toStringGettersSetters.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter the product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("price: ");
        double price = sc.nextDouble();
        System.out.print("quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println(product);

        //testando getters e setters
        product.setName("Tablet");

        System.out.println(product.getName());




    }

}
