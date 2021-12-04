package by.bsuir.wt.lab1.main;
import by.bsuir.wt.lab1.Book;
import by.bsuir.wt.lab1.comparator.Comparator;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Task12 {
        public static void main(String[] args) {
                Book book1=new Book();
                book1.setAuthor("Pogorelov");
                book1.setPrice(50);
                book1.setTitle("Morning");
                book1.setIsbn("111111");



                Book book2=new Book();
                book2.setAuthor("Pogorelov");
                book2.setPrice(100);
                book2.setTitle("Morning");
                book2.setIsbn("123551");



                Book book3=new Book();
                book3.setAuthor("Batura");
                book3.setPrice(100);
                book3.setTitle("Morning");
                book3.setIsbn("123551");


                Book book4=new Book();
                book4.setAuthor("Chromov");
                book4.setPrice(10);
                book4.setTitle("BestBook");
                book4.setIsbn("124123");


                Book book5=new Book();
                book5.setAuthor("Putyato");
                book5.setPrice(50);
                book5.setTitle("BestBook");
                book5.setIsbn("952851");
                System.out.println("Сравниваются два объекта. Автор "+ book1.getAuthor()
                        + " и "+ book2.getAuthor() +" Цена "+ book1.getPrice()
                        + " и "+ book2.getPrice() + " Заголовок "+ book1.getTitle()+ " и "
                        + book2.getTitle() + " Результат "+book1.equals(book2));
                System.out.println("Сравниваются два объекта. Автор "+ book1.getAuthor()
                        + " и "+ book3.getAuthor() +" Цена "+ book1.getPrice()
                        + " и "+ book3.getPrice() + " Заголовок "+ book1.getTitle()+ " и "
                        + book3.getTitle() + " Результат "+book1.equals(book3));
                System.out.println("Сравниваются два объекта. Автор "+ book4.getAuthor()
                        + " и "+ book5.getAuthor() +" Цена "+ book4.getPrice()
                        + " и "+ book5.getPrice() + " Заголовок "+ book4.getTitle()+ " и "
                        + book5.getTitle() + " Результат "+book4.equals(book5));

                System.out.println(book1.hashCode());
                System.out.println(book2.hashCode());
                System.out.println(book3.hashCode());
                System.out.println(book4.hashCode());
                System.out.println(book5.hashCode());


                System.out.println(book1.toString());
                System.out.println(book2.toString());
                Book book=book2.clone();
                System.out.println(book);


                ArrayList<Book> arrayList=new ArrayList<>();
                arrayList.add(book1);
                arrayList.add(book2);
                arrayList.add(book3);
                arrayList.add(book4);
                arrayList.add(book5);
                arrayList.sort(new Comparator.BookNameComparator());
                System.out.println(arrayList);
                arrayList.sort(new Comparator.BookNameAndAuthorComparator());
                System.out.println(arrayList);
                arrayList.sort(new Comparator.BookAuthorAndNameComparator());
                System.out.println(arrayList);
                arrayList.sort(new Comparator.BookAuthorNameAndPriceComparator());
                System.out.println(arrayList);
        }
}
