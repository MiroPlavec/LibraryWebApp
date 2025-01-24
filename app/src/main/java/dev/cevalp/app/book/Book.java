package dev.cevalp.app.book;

public class Book {
    private String author;
    private String title;
    private Long id;
    private String imagePath;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    public Long getId() {
        return id;
    }
}
