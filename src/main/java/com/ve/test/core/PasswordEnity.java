package com.ve.test.core;

/**
 * Created by boma on 02/11/2016.
 */
public class PasswordEnity {
    String password;
    Long createdTime;

    public Long getCreatedTime() {
        return createdTime;
    }

    public PasswordEnity(String password, Long createdTime) {

        this.password = password;
        this.createdTime = createdTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
