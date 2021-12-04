package by.bsuir.wt.lab1.action.bottom.impl;
import by.bsuir.wt.lab1.action.bottom.BottomRectangle;


public class BottomRectangleImpl implements BottomRectangle {

    @Override
    public boolean checkBottomRectangle(double x, double y) {
        final double WIDTH = 3;
        final double LONG = 12.0;
        return -LONG / 2 <= x && x <= LONG / 2 && y >= -WIDTH && y <= 0;
    }
}
