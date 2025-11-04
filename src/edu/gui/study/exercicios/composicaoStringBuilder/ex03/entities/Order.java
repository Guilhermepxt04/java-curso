package edu.gui.study.exercicios.composicaoStringBuilder.ex03.entities;

import edu.gui.study.exercicios.composicaoStringBuilder.ex03.entities.enums.OrderStatus;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order {

    LocalDateTime moment;
    OrderStatus status;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    ArrayList<OrderItem> orderItems = new ArrayList<>();

    public Order(LocalDateTime moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public String getMoment() {
        return moment.format(fmt);
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addItem(OrderItem o) {

        orderItems.add(o);
    }

    public void removeItem(OrderItem o) {

        orderItems.remove(o);
    }

    public double total() {

        double total = 0.0;
        for (OrderItem o : orderItems) {

            total += o.subTotal();
        }
        return total;
    }
}
