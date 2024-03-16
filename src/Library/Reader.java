package Library;

import Library.BookTypes.Book;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private String readerId;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Reader(String name, String readerId) {
        this.name = name;
        this.readerId = readerId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReaderId() {
        return readerId;
    }

    public void setReaderId(String readerId) {
        this.readerId = readerId;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public void displayBorrowedBooks() {
        System.out.println("Взятые книги у " + name + ":");

        if (borrowedBooks.isEmpty()) {
            System.out.println("Нет взятых книг");
            return;
        }

        for (Book book : borrowedBooks) {
            System.out.println(book.getBookInfo());
        }
    }
}

