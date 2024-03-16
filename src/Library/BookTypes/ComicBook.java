package Library.BookTypes;

public class ComicBook extends Book {
    private String comicType;

    public ComicBook(String title, String author, int year, String genre, String comicType) {
        super(title, author, year, genre);
        this.comicType = comicType;
    }

    public String getComicType() {
        return comicType;
    }

    public void setComicType(String comicType) {
        this.comicType = comicType;
    }

    @Override
    public String getBookInfo() {
        return "Комикс: " + getTitle() + " by " + getAuthor() + ", Жанры: " + getGenre() +
                ", Год: " + getYear() + ", Тип комикса: " + comicType;
    }
}
