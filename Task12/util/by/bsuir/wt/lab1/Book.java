package by.bsuir.wt.lab1;

import java.util.Comparator;

public class Book implements Cloneable,Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private String isbn;

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {

            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return price == book.price
                && (title == book.title
                || (title != null && title.equals(book.getTitle()))) && (author == book.author
                || (author != null && author.equals(book.getAuthor())
        ));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + price;
        result = prime * result +
                ((author == null) ? 0 : author.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Book [title=" + title
                + ", author=" + author
                + ", price=" + price + "]";
    }

    @Override
    public Book clone() {
        try {
            Book result = (Book) super.clone();
            result.title = new String(title);
            result.author = new String(author);
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int compareTo(Book o) {
        return isbn.compareTo(o.getIsbn());
    }

}
