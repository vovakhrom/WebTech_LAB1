package by.bsuir.wt.lab1.main;
import by.bsuir.wt.lab1.ProgrammerBook;
public class Task13 {
        public static void main(String[] args) {
                ProgrammerBook programmerBook1=new ProgrammerBook();
                programmerBook1.setAuthor("Batura");
                programmerBook1.setPrice(100);
                programmerBook1.setTitle("Hello");
                programmerBook1.setLanguage("Java");
                programmerBook1.setLevel(5);


                ProgrammerBook programmerBook2=new ProgrammerBook();
                programmerBook2.setAuthor("Batura");
                programmerBook2.setPrice(100);
                programmerBook2.setTitle("Hello");
                programmerBook2.setLanguage("Java");
                programmerBook2.setLevel(5);

                System.out.println(programmerBook1.equals(programmerBook2));
                programmerBook2.setLevel(10);
                System.out.println(programmerBook1.equals(programmerBook2));

                System.out.println(programmerBook1.hashCode());
                System.out.println(programmerBook2.hashCode());
                System.out.println( programmerBook1.toString());
                System.out.println( programmerBook2.toString());
        }
}
