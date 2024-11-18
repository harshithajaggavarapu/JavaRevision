package com.task80;

public class Book extends LibraryItem{
    private String isbn;
    private int noOfPages;

    protected Book(int itemId, String title, String isbn, int noOfPages) {
        super(itemId, title);
        this.isbn = isbn;
        this.noOfPages = noOfPages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }
}
