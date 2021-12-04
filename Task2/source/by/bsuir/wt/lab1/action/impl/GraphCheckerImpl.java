package by.bsuir.wt.lab1.action.impl;

import by.bsuir.wt.lab1.action.GraphChecker;
import by.bsuir.wt.lab1.action.bottom.BottomRectangle;
import by.bsuir.wt.lab1.action.bottom.impl.BottomRectangleImpl;
import by.bsuir.wt.lab1.action.top.impl.TopRectangleImpl;
import by.bsuir.wt.lab1.reader.impl.CustomReaderImpl;

import java.util.Scanner;

public class GraphCheckerImpl implements GraphChecker {
    private static final String VAR_X=" X";
    private static final String VAR_Y=" Y";
    @Override
    public boolean checkAllRectangles() {
        Scanner sc = new Scanner(System.in);
        CustomReaderImpl customReader=new CustomReaderImpl();
        double x=customReader.readNumber(sc,VAR_X);
        double y=customReader.readNumber(sc,VAR_Y);
        BottomRectangleImpl bottomRectangle=new BottomRectangleImpl();
        TopRectangleImpl topRectangle=new TopRectangleImpl();
        sc.close();
        return topRectangle.checkTopRectangle(x,y) || bottomRectangle.checkBottomRectangle(x,y);
    }
}
