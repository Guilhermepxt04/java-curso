package edu.gui.study.aulas.introducao;

public class Aula01TiposPrimitivos {

    public static void main(String[] args) {

        // int, double, float, char, byte, short, long, boolean
        // <tipo> <nome> = valor;
        int idade = 10;
        long numeroGrance = 100000;
        double salarioDouble = 2000.0; // em atribuicao de double e uma boa pratica usar .0
        float salarioFloat = 2500f; //em atribuicao de float e uma boa pratica usar f
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041'; //* Unicode do caracter A *//

        System.out.println("A idade é " + idade + " anos");
        System.out.println(false);
        System.out.println("char: " + caractere);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);

        // casting de variaveis

        int a,b;
        double resultado;

        a = 5;
        b = 2;

        resultado = (double) a / b;
        System.out.println(resultado);

    }

}
