package com.demo.booklist;

public class Book {
    private int imageId;
    private String title;
    private int rating;

    public Book(int imageId, String title, int rating) {
        this.imageId = imageId;
        this.title = title;
        this.rating = rating;
    }

    public int getImageId() {
        return imageId;
    }



    public String getTitle() {
        return title;
    }


    public int getRating() {
        return rating;
    }


}
