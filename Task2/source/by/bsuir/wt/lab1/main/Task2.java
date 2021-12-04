package by.bsuir.wt.lab1.main;
import by.bsuir.wt.lab1.action.GraphChecker;
import by.bsuir.wt.lab1.action.impl.GraphCheckerImpl;

public class Task2 {
        public static void main(String[] args) {
                GraphCheckerImpl graphChecker=new GraphCheckerImpl();
                System.out.println(graphChecker.checkAllRectangles());
        }
}
