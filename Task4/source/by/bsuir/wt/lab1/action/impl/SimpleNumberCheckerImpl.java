package by.bsuir.wt.lab1.action.impl;

import by.bsuir.wt.lab1.action.SimpleNumberChecker;

import java.util.Scanner;
import by.bsuir.wt.lab1.reader.impl.CustomReaderImpl;
public class SimpleNumberCheckerImpl implements SimpleNumberChecker {

    @Override
    public boolean isSimpleNumber(int number) {
        if (number == 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        double limit = Math.sqrt(number);
        for (long i = 2; i < limit; i++)
            if(number%i == 0)
                return false;
        return true;
        }



    @Override
    public int[] fillArray(Scanner in, int N) {
        CustomReaderImpl customReader=new CustomReaderImpl();
        int [] array=new int[N];
        for(int i=0;i<N;i++){
            array[i]=customReader.readNumber(new Scanner(System.in), "arr "+i);
        }
        return array;
    }

}
