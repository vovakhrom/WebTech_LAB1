package by.bsuir.wt.lab1.action.impl;

import by.bsuir.wt.lab1.action.DigitCounter;
import by.bsuir.wt.lab1.reader.impl.CustomReaderImpl;

import java.util.Scanner;

public class DigitCounterImpl implements DigitCounter {


    @Override
    public int countNumbers(int[] array) {
        int resultCount = 0;
        int currentMaxNumber = array[0];
        for(int i = 0; i < array.length - 1; i++){
            if (array[i + 1] <= currentMaxNumber){
                resultCount++;
            }
            else{
                currentMaxNumber = array[i + 1];
            }
        }
        return resultCount;
    }

        @Override
        public int[] fillArray(Scanner in, int N) {
            CustomReaderImpl customReader=new CustomReaderImpl();
            int [] array=new int[N];
            for(int i=0;i<N;i++){
                array[i]=customReader.readNumber(new Scanner(System.in), "A "+i);
            }
            return array;
        }


}

