package com.codingcrew.recview;

public class Notes {

    // ALt + Insert
    // Constructor , Getters and Setter and toString()
    private String title, description;

    public Notes(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "title=" + title +
                ", description=" + description +
                '}';
    }
}
