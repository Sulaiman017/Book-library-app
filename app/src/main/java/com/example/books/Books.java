package com.example.books;

public class Books {
    private String name;
    private String author;
    private String imageurl;
    private String description;
    private int pages;
    private int id;

    public Books(String name, String author, String imageurl, String description, int pages, int id) {
        this.name = name;
        this.author = author;
        this.imageurl = imageurl;
        this.description = description;
        this.pages = pages;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getImageurl() {
        return imageurl;
    }

    public String getDescription() {
        return description;
    }

    public int getPages() {
        return pages;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", imageurl='" + imageurl + '\'' +
                ", description='" + description + '\'' +
                ", pages=" + pages +
                ", id=" + id +
                '}';
    }
}
