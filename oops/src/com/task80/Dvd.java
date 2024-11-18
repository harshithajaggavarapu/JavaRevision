package com.task80;

public class Dvd extends LibraryItem{
    private int releaseYear;
    private String musician;

    protected Dvd(int itemId, String title, int releaseYear, String musician) {
        super(itemId, title);
        this.releaseYear = releaseYear;
        this.musician = musician;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getMusician() {
        return musician;
    }

    public void setMusician(String musician) {
        this.musician = musician;
    }
}
