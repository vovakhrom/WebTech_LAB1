package by.bsuir.wt.lab1.main;
import by.bsuir.wt.lab1.action.impl.FunctionValueImpl;
import by.bsuir.wt.lab1.reader.CustomReader;
import by.bsuir.wt.lab1.reader.impl.CustomReaderImpl;

import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {
                CustomReaderImpl customReader=new CustomReaderImpl();

                FunctionValueImpl fv=new FunctionValueImpl();
               double a= customReader.readNumber(new Scanner(System.in)," a");
               double b=customReader.readNumber(new Scanner(System.in)," b");
               double h=customReader.readNumber(new Scanner(System.in)," h");
                fv.getResult(a,b,h);
                fv.print();
        }
}
