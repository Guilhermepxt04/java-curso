package edu.gui.study.exercicios.poo.heranca.entities;

public class Employee {

    private String name;
    private Integer workHours;
    private Double valueHour;

    public Employee(String name, Integer workHours, Double valueHour) {
        this.name = name;
        this.workHours = workHours;
        this.valueHour = valueHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Integer workHours) {
        this.workHours = workHours;
    }

    public Double getValueHour() {
        return valueHour;
    }

    public void setValueHour(Double valueHour) {
        this.valueHour = valueHour;
    }

    public Double wage() {
        return valueHour * workHours;
    }
}
