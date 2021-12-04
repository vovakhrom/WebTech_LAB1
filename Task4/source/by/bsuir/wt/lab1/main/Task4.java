package by.bsuir.wt.lab1.main;
import by.bsuir.wt.lab1.action.impl.SimpleNumberCheckerImpl;
import by.bsuir.wt.lab1.reader.impl.CustomReaderImpl;
import by.bsuir.wt.lab1.impl.SimpleArrayCheckerImpl;
import java.util.Scanner;

public class Task4 {
        public static void main(String[] args) {
                SimpleArrayCheckerImpl simpleArrayChecker=new SimpleArrayCheckerImpl();
                simpleArrayChecker.fillAllArray();
                simpleArrayChecker.printPrime();
        }
}
