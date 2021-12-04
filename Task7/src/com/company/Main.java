package com.company;

import java.util.Scanner;

public class Main {

    public static int readNumber(Scanner in, String symbol) {
        System.out.println("Введите " + symbol);
        return in.nextInt();
    }


    public static void  fillArray(Scanner scanner,double [] array) {
        for (int i=0;i<array.length;i++){
            array[i]=readNumber(scanner,"a "+i);
        }
    }

    public static void shellSort (double [] array){
    int i = 0;
        while (i < array.length - 1){
        if (array[i] > array[i+1]){
            double temp = array[i+1];
            array[i+1] = array[i];
            array[i] = temp;
            if(i > 0)
                i--;
        }
        else {
            i++;
        }
    }
}
public static void printArray(double [] array){
    for (double element:array) {
        System.out.print(element+" ");
    }
}
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int N = readNumber(scanner, "N");
            double [] array=new double[N];
            fillArray(scanner,array);
            printArray(array);
            shellSort(array);
            System.out.println();
            printArray(array);
            scanner.close();

        } catch (Exception e) {
            System.out.println("Ошибка!");
            e.printStackTrace();
        }
    }
}
