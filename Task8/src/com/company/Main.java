package com.company;

import java.util.Scanner;

public class Main {


    public static int readNumber(Scanner in, String symbol) {
        System.out.println("Введите " + symbol);
        return in.nextInt();
    }
    private static void readNumbers(Scanner in, int N, String name, int[] array, int lowerBound){
        for (int i = 0; i < N; ++i) {
            array[lowerBound + i] = readNumber(in, name + "[" + i + "]");
        }
    }

    private static void logMessage(int to, int from, int offset){
        System.out.println("Необходимо поставить элемент b[" + (from - offset) +"] в позицию a[" + to + "].");
    }

    private static int[] joinArray(int lDex, int rDex, int upperBound, int[] theArray){
        final int OFFSET = rDex;
        int j = 0;
        int lowerBound = lDex;
        int mid = rDex - 1;

        int[] workspace = new int[theArray.length];

        while (lDex <= mid && rDex <= upperBound)
            if (theArray[lDex] < theArray[rDex])
                workspace[j++] = theArray[lDex++];
            else {
                logMessage(j, rDex, OFFSET);
                workspace[j++] = theArray[rDex++];
            }

        while (lDex <= mid)
            workspace[j++] = theArray[lDex++];
        while (rDex <= upperBound) {
            logMessage(j, rDex, OFFSET);
            workspace[j++] = theArray[rDex++];
        }
        return workspace;
    }

    private static void printArray(int[] array){
        for (int j : array) System.out.print(j + " ");
    }


    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            int N = readNumber(in, "N");
            int M = readNumber(in, "M");

            int[] a = new int[N + M];
            readNumbers(in, N, "A", a, 0);
            readNumbers(in, M, "B", a, N);
            in.close();

            a = joinArray(0, N, N + M - 1, a);
            printArray(a);
        } catch (Exception e){
            System.out.println("Непредвиденная ошибка!");
            e.printStackTrace();
        }

    }
}
