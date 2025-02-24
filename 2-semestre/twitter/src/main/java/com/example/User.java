package com.example;

import java.util.List;
import java.util.LinkedList;

public class User {
    
    private String userName;
    private String password;
    private List<String> followers;

    public User(String userName) {
        this.userName = userName;
        this.followers = new LinkedList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getFollowers() {
        return followers;
    }

    public void setFollowers(List<String> followers) {
        this.followers = followers;
    }
}
