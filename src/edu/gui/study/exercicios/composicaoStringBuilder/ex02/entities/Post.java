package edu.gui.study.exercicios.composicaoStringBuilder.ex02.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Post {

    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;

    private ArrayList<Comment> comments = new ArrayList<>();

    public Post(LocalDateTime moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        sb.append(likes);
        sb.append(" likes - ");
        sb.append(moment.format((fmt))).append("\n");
        sb.append(content).append("\n");
        sb.append("Comments:\n");
        for (Comment c : comments) {
            sb.append(c.getContent()).append("\n");
        }

        return sb.toString();
    }
}
