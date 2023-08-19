package com.example.comicword.data.model;

import java.util.List;

public class Chapter {
    private String chapter_id;
    private String chapter_title;
    private String story_id;
    private List<String> chapter_content;

    public Chapter(String title, String story_id, List<String> content){

        this.setChapter_title(title);
        this.setChapter_content(content);
        this.setStory_id(story_id);
    }

    public Chapter() {

    }

    public String getChapter_id() {
        return chapter_id;
    }

    public void setChapter_id(String chapter_id) {
        this.chapter_id = chapter_id;
    }

    public String getChapter_title() {
        return chapter_title;
    }

    public void setChapter_title(String chapter_title) {
        this.chapter_title = chapter_title;
    }

    public String getStory_id() {
        return story_id;
    }

    public void setStory_id(String story_id) {
        this.story_id = story_id;
    }

    public List<String> getChapter_content() {
        return chapter_content;
    }

    public void setChapter_content(List<String> chapter_content) {
        this.chapter_content = chapter_content;
    }
}
