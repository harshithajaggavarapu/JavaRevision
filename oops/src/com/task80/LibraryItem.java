package com.task80;

public class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private boolean isBorrowed;

   protected LibraryItem(int itemId, String title){
        setItemId(itemId);
        setTitle(title);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void checkOut(){
        isBorrowed = true;
        System.out.println(title+ "item successfully checked out");
    }

    public void returnItem(){
        if(isBorrowed){
            isBorrowed = false;
            System.out.println(title+ "item returned");
        }else{
            System.out.println(title+ "is already with us");
        }

    }

}
