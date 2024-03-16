package Library;

import Library.BookTypes.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public Library() {
        this.books = new ArrayList<>();
    }

    public Library(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book.getBookInfo());
        }
    }
}

