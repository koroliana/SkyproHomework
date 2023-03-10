package course1.objects;

public class Book {
    private String bookName;
    private Author author;
    private int publicationYear;


    public Book(String bookName, Author author, int publicationYear) {
        this.bookName = bookName;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return bookName + ", " + author.toString() + ", " + publicationYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book kniga = (Book) other;
        return (bookName.equals(kniga.bookName)&&author.equals(kniga.author));
    }

    @Override
    public int hashCode() {
        return (java.util.Objects.hash(bookName) + java.util.Objects.hash(author));
    }

}


