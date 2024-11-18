package com.task80;

public class Magazine extends LibraryItem{
    private String coverCeleb;
    private String releaseMonth;

    protected Magazine(int itemId, String title, String coverCeleb, String releaseMonth){
        super(itemId,title);
        this.coverCeleb = coverCeleb ;
        this.releaseMonth = releaseMonth;
    }

    public String getCoverCeleb() {
        return coverCeleb;
    }

    public void setCoverCeleb(String coverCeleb) {
        this.coverCeleb = coverCeleb;
    }

    public String getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(String releaseMonth) {
        this.releaseMonth = releaseMonth;
    }
}
