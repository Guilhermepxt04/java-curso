package edu.gui.study.exercicios.composicaoStringBuilder.ex01.entities;

import edu.gui.study.exercicios.composicaoStringBuilder.ex01.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Departments department;

    List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Departments department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department.toString();
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;

        for (HourContract c : contracts) {
            int c_year = c.getDate().getYear();
            int c_month = c.getDate().getMonthValue();
            if (c_year == year && c_month == month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
