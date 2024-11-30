import java.util.Objects;

public class Book {
    private String bookTitle;
    private Author author;
    private int yearOfPublication;

    public Book(String bookTitle, Author author, int yearOfPublication) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String toString() {
        return "Название книги - " + bookTitle + ", автор - " + author + ", год публикации - " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author, yearOfPublication);
    }
}

