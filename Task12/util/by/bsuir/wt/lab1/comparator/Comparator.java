package by.bsuir.wt.lab1.comparator;

import by.bsuir.wt.lab1.Book;

public class Comparator {

   public static class BookNameAndAuthorComparator implements java.util.Comparator<Book> {
        @Override
        public int compare(Book left, Book right){
            int result =  left.getTitle().compareTo(right.getTitle());
            if (result == 0){
                return left.getAuthor().compareTo(right.getAuthor());
            }
            return result;
        }
    }
    public static class BookNameComparator implements java.util.Comparator<Book> {
        @Override
        public int compare(Book left, Book right){
            return left.getTitle().compareTo(right.getTitle());
        }
    }


    public static class BookAuthorAndNameComparator implements java.util.Comparator<Book> {
        @Override
        public int compare(Book left, Book right){
            int result =  left.getAuthor().compareTo(right.getAuthor());
            if (result == 0){
                return left.getTitle().compareTo(right.getTitle());
            }
            return result;
        }
    }

    public static class BookAuthorNameAndPriceComparator implements java.util.Comparator<Book> {
        @Override
        public int compare(Book left, Book right) {
            int result = left.getAuthor().compareTo(right.getAuthor());
            if (result == 0) {
                result = left.getTitle().compareTo(right.getTitle());
                if (result == 0) {
                    if (left.getPrice() > right.getPrice())
                        return 1;
                    else if (left.getPrice() < right.getPrice())
                        return -1;
                    else
                        return 0;
                }
                return result;
            }
            return result;
        }
    }
}
