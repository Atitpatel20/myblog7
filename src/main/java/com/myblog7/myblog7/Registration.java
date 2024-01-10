package com.myblog7.myblog7;

public class Registration {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Registration(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
