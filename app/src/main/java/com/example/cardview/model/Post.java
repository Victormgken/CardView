package com.example.cardview.model;

public class Post {
    private String name;
    private String date;
    private String post;
    private int image;

    public Post() {
    }

    public Post(String name, String date, String post, int image) {
        this.name = name;
        this.date = date;
        this.post = post;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
