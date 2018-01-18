package blog.model;

import java.util.Date;

/**
 * Created by abuchanan57 on 1/17/18.
 */
public class Post {

    private Long id;
    private String title;
    private String body;
    private User author;
    private Date date = new Date();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Post(){}

    public Post(Long id, String title, String body, User author){
        this.id = id;
        this.title = title;
        this.body = body;
        this.author = author;
    }

    /*
    @Override
    public String toString(){
        return ""

    }*/




}