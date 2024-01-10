package com.myblog7.myblog7;

public class RegistrationDto {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
