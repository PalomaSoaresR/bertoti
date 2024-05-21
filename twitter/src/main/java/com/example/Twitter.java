package com.example;

import java.util.List;
import java.util.LinkedList;
import java.lang.String;

public class Twitter {
    private List<User> users = new LinkedList<User>();
    private List<Tweet> tweets = new LinkedList<Tweet>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> buscarUsers(String userName) {
        List<User> encontrados = new LinkedList<User>();
        for (User user : users) {
            if (user.getUserName().equals(userName))
                encontrados.add(user);
        }
        return encontrados;
    }

    public Tweet criarTweet(String conteudo, String dataHora) {
        Tweet tweet = new Tweet(conteudo, dataHora);
        tweets.add(tweet);
        return tweet;

    }

}
