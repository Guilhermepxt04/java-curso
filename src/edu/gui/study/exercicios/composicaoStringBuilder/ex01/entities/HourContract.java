package edu.gui.study.exercicios.composicaoStringBuilder.ex01.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HourContract {

    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double totalValue(){
        return valuePerHour * hours;
    }

    @Override
    public String toString() {
        return "HourContract{" +
                "date=" + date.format(fmt) +
                ", valuePerHour=" + valuePerHour +
                ", hours=" + hours +
                '}';
    }

}
