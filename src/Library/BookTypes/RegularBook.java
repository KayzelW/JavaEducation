package Library.BookTypes;

public class RegularBook extends Book {
    private String publisher;
    private String isbn; //(International Standard Book Number)

    public RegularBook(String title, String author, int year, String genre, String publisher, String isbn) {
        super(title, author, year, genre);
        this.publisher = publisher;
        this.isbn = isbn;
    }

    // getset-block-start
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    // getset-block-end

    @Override
    public String getBookInfo() {
        return "Книга: " + getTitle() + " by " + getAuthor() + ", Жанры: " + getGenre() +
                ", Год: " + getYear() + ", Издатель: " + publisher + ", ISBN: " + isbn;
    }
}

