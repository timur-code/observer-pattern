package com.company.observers;

import com.company.observable.*;
import com.company.content.*;

public class Follower implements IObserver{
    private Integer follower_id;
    private Account account;

    public Follower(Integer follower_id, Account account) {
        this.follower_id = follower_id;
        this.account = account;
        account.add(this);
    }

    @Override
    public void update(Integer postType) {
        if(postType == 1) {
            Post newPost = account.getNewPost();
            System.out.println("This follower " + follower_id + " received a new Post: " + newPost);
        } else if(postType == 2) {
        Video newVideo = account.getNewVideo();
        System.out.println("This follower " + follower_id + " received a new Video: " + newVideo);
        }
    }
}
