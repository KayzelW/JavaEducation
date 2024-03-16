import Library.BookTypes.Book;
import Library.BookTypes.RegularBook;
import Library.BookTypes.ComicBook;
import Library.Library;
import Library.Reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new RegularBook("Программирование на Java", "Джон Смит", 2020, "Программирование", "Издательство1", "1234567890"));
        books.add(new RegularBook("Python для начинающих", "Алиса Джонсон", 2019, "Программирование", "Издательство2", "0987654321"));
        books.add(new ComicBook("Человек-паук: В мире паучьих вселенных", "Marvel Comics", 2018, "Супергерои", "Графический роман"));

        List<Reader> readers = new ArrayList<Reader>();
        readers.add(new Reader("Алиса", "1001"));
        readers.add(new Reader("Боб", "1002"));

        Library library = new Library(books);

        System.out.println("Все книги в библиотеке:");
        library.displayAllBooks();
        System.out.println();

        readers.get(0).borrowBook(books.get(0));
        readers.get(1).borrowBook(books.get(1));

        for (Reader reader : readers) {
            reader.displayBorrowedBooks();
            System.out.println();
        }

        readers.get(0).returnBook(books.get(0));
        readers.get(1).returnBook(books.get(1));

        for (Reader reader : readers) {
            System.out.println("После возврата книги:");
            reader.displayBorrowedBooks();
        }
    }
}