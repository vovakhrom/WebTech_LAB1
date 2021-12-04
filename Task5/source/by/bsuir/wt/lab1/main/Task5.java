package by.bsuir.wt.lab1.main;


import by.bsuir.wt.lab1.action.impl.DigitCounterImpl;
import by.bsuir.wt.lab1.reader.impl.CustomReaderImpl;

import java.util.Scanner;

public class Task5 {
        public static void main(String[] args) {
                DigitCounterImpl digitCounter=new DigitCounterImpl();
                CustomReaderImpl customReader=new CustomReaderImpl();
                int [] a= digitCounter.fillArray(new Scanner(System.in),
                        customReader.readNumber(new Scanner(System.in),"N") );
                System.out.println(digitCounter.countNumbers(a));
        }
}
