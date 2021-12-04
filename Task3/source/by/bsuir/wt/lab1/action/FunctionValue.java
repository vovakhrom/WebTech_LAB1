package by.bsuir.wt.lab1.action;

import by.bsuir.wt.lab1.Pair;

import java.util.ArrayList;

public interface FunctionValue {
    void print();
    ArrayList<Pair> getResult(double a,double b, double h);
}
