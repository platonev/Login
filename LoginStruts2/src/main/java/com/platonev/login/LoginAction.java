package com.platonev.login;

import com.opensymphony.xwork2.Action;
import com.platonev.login.model.User;

public class LoginAction implements Action {

    private User user;

    public String execute() throws Exception {

        String username = user.getName();
        String password = user.getPassword();

        if (username == null && password == null || username.equals("") || password.equals("")) {

            return ERROR;
        } else if (username != null && username.equals("hello") && password != null && password.equals("world")) {

            return SUCCESS;
        } else {

            return ERROR;
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
