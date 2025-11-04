package edu.gui.study.exercicios.composicaoStringBuilder.ex03;

import edu.gui.study.exercicios.composicaoStringBuilder.ex03.entities.Client;
import edu.gui.study.exercicios.composicaoStringBuilder.ex03.entities.Order;
import edu.gui.study.exercicios.composicaoStringBuilder.ex03.entities.OrderItem;
import edu.gui.study.exercicios.composicaoStringBuilder.ex03.entities.Product;
import edu.gui.study.exercicios.composicaoStringBuilder.ex03.entities.enums.OrderStatus;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Enter cliente data: ");

        System.out.print("Name : ");
        String name = sc.nextLine();
        System.out.print("Email : ");
        String email = sc.nextLine();
        System.out.println("Birth Date (DD/MM/YYYY)");
        String nascimento = sc.nextLine();
        LocalDate dataNascimento = LocalDate.parse(nascimento, fmt);

        Client client = new Client(name,email, dataNascimento);

        System.out.println("Enter order data: ");

        System.out.print("Status: ");
        String status = sc.nextLine();

        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status));

        System.out.println("How many items to this order? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {

            System.out.println("Enter #" + i + " item data:");

            System.out.print("Product name: ");
            sc.nextLine();
            String nameProduct = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(nameProduct, price);

            OrderItem orderItem = new OrderItem(quantity, product.getPrice(), product);

            order.addItem(orderItem);
        }

        System.out.println(" ");

        System.out.println("ORDER SUMMARY: ");
        System.out.println("Order moment: " + order.getMoment());
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + client);
        System.out.println("Order items:");
        for (OrderItem o : order.getOrderItems()) {
            System.out.println(o.getProduct().getName() + ", R$" + String.format("%.2f", o.getProduct().getPrice()) + ", Quantity: " + o.getQuantity() + ", " +
                    "Subtotal: R$ " + o.subTotal());
        }

        System.out.println("Total price: R$" + String.format("%.2f", order.total()));
    }
}
