package by.bsuir.wt.lab1.main;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {


        public static int[][] fillArray(Scanner in, int N) {
                int[][] array = new int[N][N];
                for (int i = 0; i < N; i++) {
                        array[0][i] = readNumber(in, "a " + i);
                }
                for (int i=0;i<N;i++){
                        System.out.print(array[0][i]);
                }
                for(int i=1;i<N;i++){
                     System.arraycopy(array[i-1],0,array[i],0,N);
                }
                return array;
        }
        public static int readNumber(Scanner in, String symbol) {
                System.out.println("Введите " + symbol);
                return in.nextInt();
        }

        private static void fillTheMatrix(int[][] array){
                final int N = array.length;
                int temp = array[0][0];
                System.arraycopy(array[0], 1, array[0], 0, N-1);
                array[0][N - 1] = temp;
                for(int i=1;i<N;i++) {
                         temp = array[i-1][0];
                        System.arraycopy(array[i-1], 1, array[i], 0, N - 1);
                        array[i][N - 1] = temp;
                }
        }


        public static void printMatrix(int[][] Matrix) {
                for (int[] ints : Matrix) {
                        for (int j = 0; j < Matrix.length; j++) {
                                System.out.print(ints[j]);
                        }
                        System.out.println();
                }
        }

        public static void main(String[] args) {
                try {
                        Scanner scanner = new Scanner(System.in);
                        int N = readNumber(scanner, "N");
                        int[][] numbers = fillArray(scanner, N);
                        System.out.println();
                        scanner.close();
                        fillTheMatrix(numbers);
                        printMatrix(numbers);
                } catch (Exception e) {
                        System.out.println("Ошибка!");
                        e.printStackTrace();
                }

        }
}
