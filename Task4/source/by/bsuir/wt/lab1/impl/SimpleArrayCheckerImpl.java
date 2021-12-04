package by.bsuir.wt.lab1.impl;
import by.bsuir.wt.lab1.action.impl.SimpleNumberCheckerImpl;
import by.bsuir.wt.lab1.SimpleArrayChecker;
import by.bsuir.wt.lab1.reader.impl.CustomReaderImpl;

import java.util.Scanner;

public class SimpleArrayCheckerImpl implements SimpleArrayChecker {
    private int N;
    @Override
    public void fillAllArray() {
        CustomReaderImpl customReader=new CustomReaderImpl();
        N=customReader.readNumber(new Scanner(System.in), "N");

    }

    @Override
    public void printPrime() {
        SimpleNumberCheckerImpl simpleNumberChecker=new SimpleNumberCheckerImpl();
        int [] array= simpleNumberChecker.fillArray(new Scanner(System.in),N);
        for(int i=0;i<array.length;i++){
            if(simpleNumberChecker.isSimpleNumber(array[i])){
                System.out.println(i);
            }
        }
    }
}
