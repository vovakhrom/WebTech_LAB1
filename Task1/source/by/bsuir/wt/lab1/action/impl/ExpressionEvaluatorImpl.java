package by.bsuir.wt.lab1.action.impl;

import by.bsuir.wt.lab1.action.ExpressionEvaluator;
import by.bsuir.wt.lab1.reader.impl.CustomReaderImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpressionEvaluatorImpl implements ExpressionEvaluator {
    private double xNumber;
    private double yNumber;

    @Override
    public double calculateNumerator(double x, double y) {
        double sum = x+y;
        double sin=Math.pow(Math.sin(sum),2);
        return 1+sin;
    }

    @Override
    public double calculateDenominator(double x, double y) {
        double numerator=2*x;
        double denominator=1+Math.pow(x,2)*Math.pow(y,2);
        double module=Math.abs(x-numerator/denominator);
        return 2+module;
    }

    @Override
    public double calculateExpression(double x, double y) {
        double numerator=calculateNumerator(x,y);
        double denominator=calculateDenominator(x,y);
        return numerator/denominator + x;
    }
    public void readAllNumbers(Scanner in) {
        CustomReaderImpl csImlp=new CustomReaderImpl();
        try {
            xNumber = csImlp.readNumber(in, "X");
            yNumber = csImlp.readNumber(in, "Y");
        }catch(InputMismatchException i){
            System.out.println("Некорректный ввод! Ожидалось действительное значение.");
            System.exit(0);
        }
    }

    public double endCalculation(){
        readAllNumbers(new Scanner(System.in));
        double numerator=calculateNumerator(xNumber,yNumber);
        double denominator=calculateDenominator(xNumber,yNumber);
        return numerator/denominator + xNumber;
    }

}
