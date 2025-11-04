package edu.gui.study.exercicios.composicaoStringBuilder.ex01;

import edu.gui.study.exercicios.composicaoStringBuilder.ex01.entities.Departments;
import edu.gui.study.exercicios.composicaoStringBuilder.ex01.entities.HourContract;
import edu.gui.study.exercicios.composicaoStringBuilder.ex01.entities.Worker;
import edu.gui.study.exercicios.composicaoStringBuilder.ex01.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmtIncome = DateTimeFormatter.ofPattern("MM/yyyy");

        System.out.print("Enter departments's name: ");
        Departments department = new Departments(sc.nextLine());

        System.out.println("Enter the worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        String level = sc.nextLine();

        System.out.print("Base salary: ");
        Double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, department);

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {
            System.out.println("Enter contract #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            sc.nextLine();
            LocalDate date = (LocalDate.parse(sc.nextLine(), fmt));

            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            Integer hours = sc.nextInt();

            HourContract hourContract = new HourContract(date, valuePerHour, hours);

            worker.addContract(hourContract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        sc.nextLine();
        String monthYear = sc.nextLine();
        int month = Integer.parseInt(monthYear.substring(0, 2));
        int year = Integer.parseInt(monthYear.substring(3));


        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment());
        System.out.println("Income for " + monthYear + " " + String.format("%.2f", worker.income(year, month)));
        
    }
}
