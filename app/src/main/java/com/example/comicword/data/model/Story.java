package com.example.comicword.data.model;

public class Story {

    private String story_id;
    private String story_title;
    private String story_author;
    private String story_description;
    private String sotry_coverImageUrl;

    public Story(String title, String author, String description, String coverImageUrl) {
        this.setStory_title(title);
        this.setStory_author(author);
        this.setStory_description(description);
        this.setSotry_coverImageUrl(coverImageUrl);
    }

    public Story(){

    }

    public String getStory_id() {
        return story_id;
    }

    public void setStory_id(String story_id) {
        this.story_id = story_id;
    }

    public String getStory_title() {
        return story_title;
    }

    public void setStory_title(String story_title) {
        this.story_title = story_title;
    }

    public String getStory_author() {
        return story_author;
    }

    public void setStory_author(String story_author) {
        this.story_author = story_author;
    }

    public String getStory_description() {
        return story_description;
    }

    public void setStory_description(String story_description) {
        this.story_description = story_description;
    }

    public String getSotry_coverImageUrl() {
        return sotry_coverImageUrl;
    }

    public void setSotry_coverImageUrl(String sotry_coverImageUrl) {
        this.sotry_coverImageUrl = sotry_coverImageUrl;
    }
}
