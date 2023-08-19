package com.example.comicword.data.model;

public class User {
    private String user_id;
    private String user_name;
    private String user_email;
    private String user_avatarUrl;
    private String user_role;

    public User(String name, String email, String avatarUrl,String role) {
        this.setUser_name(name);
        this.setUser_email(email);
        this.setUser_avatarUrl(avatarUrl);
        this.setUser_role(role);
    }

    public User(String name, String email, String avatarUrl) {
        this.setUser_name(name);
        this.setUser_email(email);
        this.setUser_avatarUrl(avatarUrl);
        this.setUser_role("user");
    }

    public User(){

    }


    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_avatarUrl() {
        return user_avatarUrl;
    }

    public void setUser_avatarUrl(String user_avatarUrl) {
        this.user_avatarUrl = user_avatarUrl;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }
}
