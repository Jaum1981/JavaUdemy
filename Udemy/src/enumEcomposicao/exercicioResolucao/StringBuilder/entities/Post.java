package enumEcomposicao.exercicioResolucao.StringBuilder.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {


    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post() {
    }

    public Post(LocalDateTime moment, String title, String content, int likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comments) {
        this.comments.add(comments);
    }

    public void removeComment(Comment comments) {
        this.comments.remove(comments);
    }

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/mm/yyyy H:mm:ss");

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(moment.format(fmt) + "\n");
        sb.append(content + "\n");
        sb.append("Comments\n");
        for (Comment c : comments) {
            sb.append(c.getText());
        }
        return sb.toString();
    }


}
