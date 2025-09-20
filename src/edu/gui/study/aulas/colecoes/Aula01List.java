package edu.gui.study.aulas.colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula01List {

    public static void main(String[] args) {

        List <String> list = new ArrayList<>(); //Instanciando Lista

        //Adicionando elementos na lista
        list.add("Maria");
        list.add("Bob");
        list.add("Alex");
        list.add("Ana");
        list.add(2, "Marco");
        list.add("Bia");

        System.out.println(list.size()); //imprimindo tamanho da lista

        list.removeIf(x -> x.charAt(0) == 'A'); //removendo com base em predicado
        list.remove(2); //removendo com base no index (posicao)

        for (String x : list) {
            System.out.println(x);
        }

        List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'B').toList(); // Criando um filtro de lista com predicado

        System.out.println(list.indexOf("Marco")); // retorna -1 quando o elemento n ta na lista
        System.out.println(list.indexOf("Bob"));

        System.out.println(resultado);

        String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null); // pegando a primeira ocorrencia da lista
        // que começa com B

        System.out.println(name);



    }

}
