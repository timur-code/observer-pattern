package com.company.content;

public class Video {
    private Integer video_id;
    private String title;
    private String link;

    public Video(Integer video_id, String title, String link) {
        this.video_id = video_id;
        this.title = title;
        this.link = link;
    }

    public Integer getVideo_id() {
        return video_id;
    }

    public void setVideo_id(Integer video_id) {
        this.video_id = video_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Video{" +
                "video_id=" + video_id +
                ", title='" + title + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
