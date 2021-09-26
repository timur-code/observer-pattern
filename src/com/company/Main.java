package com.company;

import com.company.content.Post;
import com.company.content.Video;
import com.company.observable.Account;
import com.company.observers.Follower;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        Follower f1 = new Follower(1, account);
        Follower f2 = new Follower(2, account);

        Post newPost = new Post(1, "www.post.com", "First post");
        Video newVideo = new Video(1, "First video", "videos.com");
        account.publishNewPost(newPost);
        account.publishNewVideo(newVideo);

        System.out.println("---------------------------------\n");

        account.remove(f2);
        Post post2 = new Post(2, "www.post.com", "Second post");
        account.publishNewPost(post2);
    }
}
