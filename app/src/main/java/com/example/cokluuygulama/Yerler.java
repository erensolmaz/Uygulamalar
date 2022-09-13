package com.example.cokluuygulama;

public class Yerler {
    private String Title;
    private String Category;
    private String Description;
    private int Thumbnail;

    public Yerler(){

    }
    public Yerler(String title, String category, String description, int thumbnail){
        Title = title;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;

    }
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
