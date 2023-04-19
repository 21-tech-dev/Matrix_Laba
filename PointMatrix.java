public class PointMatrix {
    private List<Point> points;

    public PointMatrix() {
        points = new ArrayList<>();
    }

    public void addPoint(Point p) {
        points.add(p);
    }

    public Point getPoint(int index) {
        return points.get(index);
    }

    public int size() {
        return points.size();
    }
}
