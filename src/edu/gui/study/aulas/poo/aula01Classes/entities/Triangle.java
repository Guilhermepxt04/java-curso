package edu.gui.study.aulas.poo.aula01Classes.entities;

public class Triangle {

    // Atributos da clase
    public double a;
    public double b;
    public double c;

    // Construtor
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Metodos
    public double Area() {

        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

}
