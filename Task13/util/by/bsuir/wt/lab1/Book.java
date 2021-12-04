package by.bsuir.wt.lab1;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public String getTitle() {
        return title;
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
                || (title != null &&title.equals(book.getTitle())))
                && (author == book.author
                || (author != null && author .equals(book.getAuthor())
        ));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + price; result = prime * result +
                ((author == null) ? 0 : author.hashCode()); return result;
    }
    @Override
    public String toString() {
        return "Book [title=" + title
                + ", author=" + author
                + ", price=" + price+",";
    }

}
