package com.example.javabean.request;

/**
 * Created by Administrator on 2016/6/8 0008.
 */
public class User {

    private String email;
//    private String mobile;
//    private String username;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public String getMobile() {
//        return mobile;
//    }
//
//    public void setMobile(String mobile) {
//        this.mobile = mobile;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
//    public User(String email, String mobile, String username, String password) {
//        this.email = email;
//        this.mobile = mobile;
//        this.username = username;
//        this.password = password;
//    }
}
