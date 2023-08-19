package com.example.comicword.data.model;

public class History {
    private String history_id;
    private String story_id;
    private String chapter_id;
    private long history_timeTamp;

    public History(String story_id, String chapter_id, long timeTamp){
        this.setStory_id(story_id);
        this.setChapter_id(chapter_id);
        this.setHistory_timeTamp(timeTamp);
    }

    public History(){

    }


    public String getHistory_id() {
        return history_id;
    }

    public void setHistory_id(String history_id) {
        this.history_id = history_id;
    }

    public String getStory_id() {
        return story_id;
    }

    public void setStory_id(String story_id) {
        this.story_id = story_id;
    }

    public String getChapter_id() {
        return chapter_id;
    }

    public void setChapter_id(String chapter_id) {
        this.chapter_id = chapter_id;
    }

    public long getHistory_timeTamp() {
        return history_timeTamp;
    }

    public void setHistory_timeTamp(long history_timeTamp) {
        this.history_timeTamp = history_timeTamp;
    }
}
