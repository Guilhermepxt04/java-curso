package edu.gui.study.aulas.enumeracoes.aula01Enum.entities;

import edu.gui.study.aulas.enumeracoes.aula01Enum.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Order {

    private Integer id;
    private LocalDate moment;
    private OrderStatus status;


    public Order(Integer id, LocalDate moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment.format(fmt) +
                ", status=" + status +
                '}';
    }
}


