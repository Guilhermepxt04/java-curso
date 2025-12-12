package edu.gui.study.exercicios.poo.heranca.app;

import edu.gui.study.exercicios.poo.heranca.entities.Employee;
import edu.gui.study.exercicios.poo.heranca.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        double additionalCharge = 0.0;

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data: ");

            System.out.print("Outsourced (y/n)?");
            char outsourced = sc.next().toLowerCase().charAt(0);


            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            Integer workHours = sc.nextInt();

            System.out.print("Value per hour: ");
            Double valueHour = sc.nextDouble();

            if ( outsourced == 'y') {
                System.out.print("Additional charge: ");
                additionalCharge = sc.nextDouble();
            }

            Employee e = (outsourced == 'y') ? new OutsourcedEmployee(name, workHours, valueHour, additionalCharge) : new Employee(name, workHours, valueHour);
            employees.add(e);
        }

        System.out.println("PAYMENTS: ");
        for (Employee e : employees) {
            System.out.println(e.getName() + " - " + "$ " + String.format("%.2f", e.wage()));
        }
    }
}
