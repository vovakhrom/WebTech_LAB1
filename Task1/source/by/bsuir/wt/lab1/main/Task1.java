package by.bsuir.wt.lab1.main;
import java.sql.SQLOutput;
import java.util.Scanner;

import by.bsuir.wt.lab1.action.ExpressionEvaluator;
import by.bsuir.wt.lab1.reader.impl.CustomReaderImpl;
import by.bsuir.wt.lab1.action.impl.ExpressionEvaluatorImpl;

public class Task1 {

        public static void main(String[] args) {
            ExpressionEvaluatorImpl evaluator=new ExpressionEvaluatorImpl();
            System.out.println(evaluator.endCalculation());
        }
}
