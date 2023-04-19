public class Circle {
	private Point center;
	private double radius;

	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	public boolean contains(Point p) {
		double dx = center.getX() - p.getX();
		double dy = center.getY() - p.getY();
		double distanceSquared = dx * dx + dy * dy;
		return distanceSquared <= radius * radius;
	}
}
