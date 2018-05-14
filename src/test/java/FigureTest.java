import com.company.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class FigureTest {

    @Test
    public void test1(){
        Point p1 = new Point(2,3);
        Figure f1 = new Circle(new Point(1,1),4);

        assertTrue(f1.containsPoint(p1));
    }
    @Test
    public void test2(){
        Point p1 = new Point(1,6);
        Figure f1 = new Circle(new Point(1,1),4);

        assertFalse(f1.containsPoint(p1));
    }
    @Test
    public void test3(){
        Point p1 = new Point(2,4);
        Figure f1 = new Rectangle(new Point(1,1),new Point(3,5));

        assertTrue(f1.containsPoint(p1));
    }
    @Test
    public void test4(){
        Point p1 = new Point(4,4);
        Figure f1 = new Rectangle(new Point(1,1), new Point(3,5));

        assertFalse(f1.containsPoint(p1));
    }

    @Test
    public void test5(){
        List<Figure> figureList = new LinkedList<>();
        figureList.add(new Rectangle(new Point(8.5, 17.0), new Point(25.5, -8.5)));
        figureList.add(new Circle(new Point(20.2, 7.3), 5.8));
        figureList.add(new Rectangle(new Point(0.0, 10.3), new Point(5.5, 0.0)));
        figureList.add(new Circle(new Point(-5.0, -5.0), 3.7));
        figureList.add(new Rectangle(new Point(2.5, 12.5), new Point(12.5, 2.5)));
        figureList.add(new Circle(new Point(5.0, 15.0), 7.2));

        List<Point> pointList = new LinkedList<>();
        pointList.add(new Point(2.0, 2.0));
        pointList.add(new Point(4.7, 5.3));
        pointList.add(new Point(6.9, 11.2));
        pointList.add(new Point(20.0, 20.0));
        pointList.add(new Point(17.6, 3.2));
        pointList.add(new Point(-5.2, -7.8));

        List<String> expectedResult = Arrays.asList(
                "Point 1 is contained in figure 3",
                "Point 2 is contained in figure 3",
                "Point 2 is contained in figure 5",
                "Point 3 is contained in figure 5",
                "Point 3 is contained in figure 6",
                "Point 4 is not contained in any figure",
                "Point 5 is contained in figure 1",
                "Point 5 is contained in figure 2",
                "Point 6 is contained in figure 4");

        assertEquals(expectedResult, Main.printRelations(figureList, pointList));
    }
}
