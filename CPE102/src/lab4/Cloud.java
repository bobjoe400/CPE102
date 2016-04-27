package lab4;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Cloud {

	ArrayList<Point2D> points;
	
	public Cloud(){
		points = new ArrayList<Point2D>();
	}
	
	public void add(Point2D point){
		points.add(point);
	}
	
	public void draw(Graphics2D g){
		for(Point2D point: points){
			g.drawOval((int)point.getX(), (int)point.getY(), 5, 5);
		}
	}
}
