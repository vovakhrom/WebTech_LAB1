package by.bsuir.wt.lab1.action.top.impl;
import by.bsuir.wt.lab1.action.top.TopRectangle;


public class TopRectangleImpl implements TopRectangle {

    @Override
    public boolean checkTopRectangle(double x,double y) {
        final double WIDTH = 5;
        final double LONG = 8.0;
        return -LONG / 2 <= x && x <= LONG / 2 && y <= WIDTH && y >= 0;
    }
}
