package ca.bcit.winter2021.comp2522.midterm.question7;

import java.awt.color.ICC_ColorSpace;

public class Book implements Comparable<Book>{
    private int pages;
    private String title;

    public Book(int pages, String title) {
        this.pages = pages;
        this.title = title;
    }
    public int getPages() {
        return pages;
    }
    public String getTitle() {
        return title;
    }
    @Override
    public int compareTo(Book other) {
        if (this.getPages() > other.getPages()){
            return 1;
        } else if (this.getPages() < other.getPages()){
            return -1;
        }
        return 0;
    }
}
