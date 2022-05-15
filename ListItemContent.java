package com.example.android.tourguide;

public class ListItemContent {
    private int image_source;
    private int list_item_content_text;
    private String location_text;

    //Constructor
    public ListItemContent(int image_source, int list_item_content_text, String location_text) {
        this.image_source = image_source;
        this.list_item_content_text = list_item_content_text;
        this.location_text = location_text;
    }

    //Getters
    public int getImage_source(){return image_source;}
    public int getList_item_content_text(){
        return list_item_content_text;
    }
    public String getLocation_text(){
        return location_text;
    }
}
