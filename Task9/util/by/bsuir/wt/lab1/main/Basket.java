package by.bsuir.wt.lab1.main;
import by.bsuir.wt.lab1.main.Ball;

import java.util.ArrayList;

public class Basket {
    public ArrayList<Ball> balls;
    public double weight;

    public Basket()
    {
        this.balls = new ArrayList<>();
    }

    public void add(Ball newBall)
    {
        if (newBall == null)
            throw new NullPointerException();

        this.balls.add(newBall);
        this.weight += newBall.weight;
    }

    public int getColorCount(String color)
    {
        int numOfBalls = 0;
        for (Ball  ball: balls)
        {
            if (ball.color.equals(color))
                numOfBalls++;
        }

        return numOfBalls;
    }
}
