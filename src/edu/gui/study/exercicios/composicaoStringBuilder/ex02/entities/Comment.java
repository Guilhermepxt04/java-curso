package edu.gui.study.exercicios.composicaoStringBuilder.ex02.entities;

public class Comment {

    String content;

    public Comment(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "content='" + content + '\'' +
                '}';
    }
}
