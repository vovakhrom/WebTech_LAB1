package by.bsuir.wt.lab1.main;
import by.bsuir.wt.lab1.main.Ball;
import by.bsuir.wt.lab1.main.Basket;

public class Task9 {
        public static void main(String[] args) {
                Basket basket=new Basket();
                Ball blueBall1=new Ball(10,"blue");
                Ball greenBall=new Ball(10,"green");
                Ball blueBall2=new Ball(30.5,"blue");
                Ball pinkBall=new Ball(10,"pink");
                basket.add(blueBall1);
                basket.add(greenBall);
                basket.add(blueBall2);
                basket.add(pinkBall);
                System.out.println(basket.getColorCount("blue"));
        }
}
