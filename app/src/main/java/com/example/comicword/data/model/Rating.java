package com.example.comicword.data.model;

public class Rating {

    private String rating_id;
    private String user_id;
    private int value;
    private String story_id;
    private long rating_timeTamp;

    public Rating(String user_id, int value, String story_id,long timeTamp){
        this.setUser_id(user_id);
        this.setValue(value);
        this.setStory_id(story_id);
        this.setRating_timeTamp(timeTamp);
    }

    public Rating(String user_id, String story_id,long timeTamp){
        this.setUser_id(user_id);
        this.setValue(0);
        this.setStory_id(story_id);
        this.setRating_timeTamp(timeTamp);
    }

    public Rating(){

    }

    public String getRating_id() {
        return rating_id;
    }

    public void setRating_id(String rating_id) {
        this.rating_id = rating_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int nValue) {
        if(value >= 0 && value <= 5) {
           this.value = nValue;
        } else {
            this.value = 0;
        }
    }

    public String getStory_id() {
        return story_id;
    }

    public void setStory_id(String story_id) {
        this.story_id = story_id;
    }

    public long getRating_timeTamp() {
        return rating_timeTamp;
    }

    public void setRating_timeTamp(long rating_timeTamp) {
        this.rating_timeTamp = rating_timeTamp;
    }
}
