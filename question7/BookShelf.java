package ca.bcit.winter2021.comp2522.midterm.question7;

import ca.bcit.winter2021.comp2522.midterm.question3.FollowerSorter;
import ca.bcit.winter2021.comp2522.midterm.question3.TwitterAccount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookShelf {
    ArrayList<Book> books;
    public BookShelf() {
        this.books = new ArrayList<>();
    }
    public BookShelf(ArrayList<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        this.books.add(book);
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
    //    public void sortBooksBasedOnPages(){
//        Collections.sort(this.books);
//    }
    public void sort(ArrayList<Book> pages){
        Collections.sort(pages);
    }
    public void sortBooksBasedOnPages(){
        this.sort(this.books);
    }
    @Override
    public String toString(){
        String result="";
        for(int i =0; i<books.size();i++){
            result = result + "Title: " + this.books.get(i).getTitle() + "("+ "Pages: " + this.books.get(i).getPages() + ")" +
                    "\n";
        }
        return result;
    }
}
