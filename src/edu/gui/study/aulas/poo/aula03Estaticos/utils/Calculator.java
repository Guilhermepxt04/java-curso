package edu.gui.study.aulas.poo.aula03Estaticos.utils;

public class Calculator  {

    public static final double PI = 3.14;

    //metodos static podem ser utilizado mesmo sem a classe ser instanciada
    public static double circumferencia(Double radius) {

        return 2*  PI * radius;

    }

    public static double volume(Double radius) {

        return 4 * PI * radius * radius * radius / 3;

    }


}
