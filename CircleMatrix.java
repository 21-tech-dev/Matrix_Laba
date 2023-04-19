
public class CircleMatrix {
private List<Circle> circles;

public CircleMatrix() {
    circles = new ArrayList<>();
}

public void addCircle(Circle c) {
circles.add(c);
}

public boolean containsPoint(Point p) {
    for (Circle c : circles) {
        if (c.contains(p)) {
            return true;
        }
    }
    return false;
   }
}

