package com.example.demo.entities;

import java.util.Date;

public class UserHistory {
    private int id;
    private Date logTime;
    private User user;
    private String action;

    public UserHistory(Date logTime, User user, String action) {
        this.logTime = logTime;
        this.user = user;
        this.action = action;
    }

    public UserHistory() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
