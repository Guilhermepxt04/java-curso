package edu.gui.study.aulas.poo.aula02toStringGettersSetters.entities;

public class Product {

    private String name;
    private Double price;
    private int quantity;

    //Sobrecarga com 3 tipos de construtores
    public Product(){}

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //getters e setters
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
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
