package lab4;

import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 * A polygon is a closed curve made up from line segments that join the corner
 * points.
 */
public class Polygon {
	// . . .
	public ArrayList<Point2D> points;

	/**
	 * Constructs a polygon with no corner points.
	 */
	public Polygon() {
		// . . .
		points = new ArrayList<Point2D>();
	}

	/**
	 * Adds a corner point to the polygon.
	 * 
	 * @param x
	 *            the x-coordinate of the point
	 * @param y
	 *            the y-coordinate of the point
	 */
	public void add(double x, double y) {
		// . . .
		points.add(new Point2D.Double(x, y));
	}

	/**
	 * Calculates the perimeter of a polygon.
	 * 
	 * @return the perimeter of this polygon
	 */
	public double perimeter() {
		// . . .
		double distance = 0;
		if (points.size() > 1) {
			for (int i = 1; i < points.size(); i++) {
				Point2D curr = points.get(i);
				Point2D prev = points.get(i - 1);
				distance += Math.sqrt(Math.pow(curr.getX() - prev.getX(), 2) + Math.pow(curr.getY() - prev.getY(), 2));
			}
		}
		Point2D curr = points.get(points.size() - 1);
		Point2D prev = points.get(0);
		distance += Math.sqrt(Math.pow(curr.getX() - prev.getX(), 2) + Math.pow(curr.getY() - prev.getY(), 2));
		return Math.round(distance);
	}

	/**
	 * Calculates the area of a polygon.
	 * 
	 * @return the area of this polygon
	 */
	public double area() {
		// . . .
		double area = 0;
		if (points.size() > 2) {
			int j = points.size() - 1;

			for (int i = 0; i < points.size(); i++) {
				area += (points.get(j).getX() + points.get(i).getX()) * (points.get(j).getY() - points.get(i).getY());
				j = i;
			}
		}
		return Math.round(Math.abs(area / 2));
	}
}
