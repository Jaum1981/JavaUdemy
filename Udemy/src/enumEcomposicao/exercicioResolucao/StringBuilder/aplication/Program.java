package enumEcomposicao.exercicioResolucao.StringBuilder.aplication;

import java.time.LocalDateTime;

import enumEcomposicao.exercicioResolucao.StringBuilder.entities.Comment;
import enumEcomposicao.exercicioResolucao.StringBuilder.entities.Post;

public class Program {
    public static void main(String[] args) {

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow, that's awesome!!!");

        LocalDateTime d05 = LocalDateTime.parse("2018-06-21T13:30:44");

        Post post1 = new Post(d05, "Traveling to New Zeeland", "I'm going to visit this wonderfull country!", 12);
        post1.addComment(c1);
        post1.addComment(c2);

        System.out.println(post1);

    }
}
