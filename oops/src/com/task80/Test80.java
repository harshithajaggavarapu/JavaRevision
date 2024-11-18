package com.task80;

public class Test80 {
    public static void main(String[] args) {
        Book b = new Book(1,"verity","1244", 120);
        Magazine m = new Magazine(2, "vogue", "anushka","january");
        Dvd d = new Dvd(3, "amaran",2024, "dsp");
        b.returnItem();
        b.checkOut();
        m.checkOut();
        m.returnItem();
        d.checkOut();
        d.returnItem();

    }
}
