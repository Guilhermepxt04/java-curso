package edu.gui.study.aulas.poo.aula02toString.entities;

public class Product {

    String name;
    Double price;
    int quantity;

    public Product(String name, double price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValue(){

        return price * quantity;
    }

    @Override
    public String toString() {
        return "Product data: " +
                name + ", $ " +
                String.format("%.2f", price) +
                ", quantity: " +
                quantity +
                " total value: " +
                String.format("%.2f", totalValue());
    }
}
