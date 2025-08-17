package edu.gui.study.aulas.introducao;

import java.util.Locale;

public class Aula02Output {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // objeto importado do pacote "util", serve para trocar a , na casa dos decimais por .
        double x = 10.35784;
        String nome = "maria";
        int idade = 31;
        double renda = 4000.00;
        System.out.println(x);
        System.out.printf("%.2f%n", x); // o numero dentro das % define quantas casas decimais da variavel serao impressas
        System.out.println("Resultado = " + x + "metros"); // Concatenando
        System.out.printf("Resultado = %.2f metros%n", x); // saida usando o print format passando quantas casas devem ser impressas
        System.out.printf("%s tem %d anos e uma renda de R$ %.2f reais%n", nome, idade, renda); // format com varias variaveis

        /*
        %f variaveis com casa flutuante
        %d variaveis de numero inteiro
        %s strings
        %n quebra de linha
        */

    }
}
