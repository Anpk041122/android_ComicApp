package com.example.comicword.data.model;

public class Comment {
    private String comment_id;
    private String comment_content;
    private String user_id;
    private long  comment_timeTamp;

    public Comment(String content, String user_id, long timeTamp){
        this.setComment_content(content);
        this.setUser_id(user_id);
        this.setComment_timeTamp(timeTamp);
    }

    public Comment(){

    }

    public String getComment_id() {
        return comment_id;
    }

    public void setComment_id(String comment_id) {
        this.comment_id = comment_id;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public long getComment_timeTamp() {
        return comment_timeTamp;
    }

    public void setComment_timeTamp(long comment_timeTamp) {
        this.comment_timeTamp = comment_timeTamp;
    }
}
