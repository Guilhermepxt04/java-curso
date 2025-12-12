package edu.gui.study.exercicios.poo.polimorfismo.app;

import edu.gui.study.exercicios.poo.polimorfismo.entities.ImportedProduct;
import edu.gui.study.exercicios.poo.polimorfismo.entities.Product;
import edu.gui.study.exercicios.poo.polimorfismo.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().toLowerCase().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                Product p = new ImportedProduct(name, price, customsFee);
                products.add(p);
            } else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                sc.nextLine();
                String stringManufactureDate = sc.nextLine();
                LocalDate manufactureDate = LocalDate.parse(stringManufactureDate, fmt01);
                Product p = new UsedProduct(name, price, manufactureDate);
                products.add(p);
            } else if (type == 'c') {
                Product p = new Product(name, price);
                products.add(p);
            }
        }

        System.out.println("PRICES TAGS");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }
    }
}
