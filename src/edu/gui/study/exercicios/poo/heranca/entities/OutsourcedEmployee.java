package edu.gui.study.exercicios.poo.heranca.entities;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsourcedEmployee(String name, Integer workHours, Double valueHour, Double additionalCharge) {
        super(name, workHours, valueHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double wage() {
        return super.wage() + (additionalCharge / 100) * 110;

    }
}
