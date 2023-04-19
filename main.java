import java.util.ArrayList;
import java.util.List;

import CircleMatrix;
import Point;
import Circle;
inport PointMatrix;


public class Main{
    public static void main (String args[]){
    CircleMatrix circleMatrix = new CircleMatrix();
    circleMatrix.addCircle(new Circle(new Point(0, 0), 1.0));
    circleMatrix.addCircle(new Circle(new Point(2, 2), 2.0));
    
    System.out.println(circleMatrix.containsPoint(new Point(1, 1))); // true
    System.out.println(circleMatrix.containsPoint(new Point(3, 3))); // false

    PointMatrix pointMatrix = new PointMatrix();
    pointMatrix.addPoint(new Point(0, 0));
    pointMatrix.addPoint(new Point(2, 2));
    pointMatrix.addPoint(new Point(3, 3));
    
    for (int i = 0; i < pointMatrix.size(); i++) {
        Point p = pointMatrix.getPoint(i);
        if (circleMatrix.containsPoint(p)) {
            System.out.println("Point " + p.getX() + "," + p.getY() + " is in a circle.");
        } else {
            System.out.println("Point " + p.getX() + "," + p.getY() + " is not in a circle.");
        }
    }   
    }
}
