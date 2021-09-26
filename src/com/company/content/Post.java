package com.company.content;

public class Post {
    private Integer post_id;
    private String post_link;
    private String post_text;

    public Post(Integer post_id, String post_link, String post_text) {
        this.post_id = post_id;
        this.post_link = post_link;
        this.post_text = post_text;
    }

    public Integer getPost_id() {
        return post_id;
    }

    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    public String getPost_link() {
        return post_link;
    }

    public void setPost_link(String post_link) {
        this.post_link = post_link;
    }

    public String getPost_text() {
        return post_text;
    }

    public void setPost_text(String post_text) {
        this.post_text = post_text;
    }

    @Override
    public String toString() {
        return "Post{" +
                "post_id=" + post_id +
                ", post_link='" + post_link + '\'' +
                ", post_text='" + post_text + '\'' +
                '}';
    }
}
