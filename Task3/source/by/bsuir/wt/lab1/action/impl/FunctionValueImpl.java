package by.bsuir.wt.lab1.action.impl;

import by.bsuir.wt.lab1.Pair;
import by.bsuir.wt.lab1.action.FunctionValue;
import java.util.ArrayList;

public class FunctionValueImpl implements FunctionValue {
    private final ArrayList<Pair> pairList=new ArrayList<Pair>();

    @Override
    public void print() {
        System.out.printf("%9s%10s\n", "X", "F(x)");
        System.out.println("--------------------------");
        for (Pair pair : pairList) {
            System.out.printf("%9.3f%10.3f\n", pair.x , pair.Fx);
        }
        System.out.println("--------------------------");
    }

    @Override
    public ArrayList<Pair> getResult(double a,double b, double h) {
        double current=a;
        while(current<=b){
            pairList.add(new Pair(current,Math.tan(current)));
            current=current+h;
        }
        return pairList;
    }
}
