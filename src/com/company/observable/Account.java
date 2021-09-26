package com.company.observable;

import com.company.content.*;
import com.company.observers.IObserver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Account implements IObservable{
    List <IObserver> followers;
    List <Post> posts;
    List <Video> videos;

    public Account() {
        this.followers = new ArrayList<>();
        this.posts = new LinkedList<>();
        this.videos = new LinkedList<>();
    }

    @Override
    public void add(IObserver observer) {
        this.followers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.followers.remove(observer);
    }

    @Override
    public void notifyObservers(Integer postType) {
        for(IObserver observer: followers){
            observer.update(postType);
        }
    }

    public void publishNewPost(Post post) {
        posts.add(post);
        notifyObservers(1);
    }

    public Post getNewPost() {
        int last = posts.size() - 1;
        return posts.get(last);
    }

    public void publishNewVideo(Video video){
        videos.add(video);
        notifyObservers(2);
    }

    public Video getNewVideo() {
        int last = videos.size() - 1;
        return videos.get(last);
    }
}
