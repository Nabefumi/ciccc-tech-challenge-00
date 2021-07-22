package ca.bcit.winter2021.comp2522.midterm.question7;

public class TestQuestion7 {
    public static void runAllTestScenariosForQuestion7(){
        BookShelf test1 = new BookShelf();
        Book book1 = new Book(288, "Never Let Me Go");
        Book book2 = new Book(800, "Harry Potter");
        Book book3 = new Book(236, "book");
        test1.addBook(book1);
        test1.addBook(book2);
        test1.addBook(book3);
        test1.sortBooksBasedOnPages();
        System.out.println(test1);
    }
}
