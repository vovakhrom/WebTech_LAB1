package by.bsuir.wt.lab1.reader.impl;
import by.bsuir.wt.lab1.reader.CustomReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomReaderImpl implements CustomReader {

    @Override
    public int readNumber(Scanner in, String var) {
        try {
            System.out.println("Введитe " + var + ":");
            return in.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Некорректный ввод");
            System.exit(0);
        }
        return 0;
    }
}
