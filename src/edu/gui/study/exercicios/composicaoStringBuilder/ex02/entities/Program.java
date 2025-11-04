package edu.gui.study.exercicios.composicaoStringBuilder.ex02.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Scanner sc = new Scanner(System.in);

        String stringMomentPost = sc.nextLine();
        LocalDateTime momentPost = LocalDateTime.parse(stringMomentPost, fmt);
        String title = sc.nextLine();
        String content = sc.nextLine();
        Integer likes = sc.nextInt();

        Post post = new Post(momentPost, title, content, likes);

        Comment comment1 = new Comment("Have a nice trip");

        post.addComment(comment1);

        Comment comment2 = new Comment("Wow that's awesome");

        post.addComment(comment2);

        System.out.println(post);

    }
}
