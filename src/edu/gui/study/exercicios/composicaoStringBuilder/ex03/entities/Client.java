package edu.gui.study.exercicios.composicaoStringBuilder.ex03.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {

    String name;
    String email;
    LocalDate birth;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Client(String name, String email, LocalDate birth) {
        this.name = name;
        this.email = email;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Client: " + name + " (" + birth.format(fmt) + ")" + " - " + email;
    }
}
