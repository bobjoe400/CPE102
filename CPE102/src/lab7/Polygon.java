package lab7;

import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
   A polygon with a number of Point2D.Double corners
*/
public class Polygon
{
   private ArrayList<Point2D.Double> corners;
   int index;
   double area;

   /**
      Constructs a Polygon object with no corners
   */
   public Polygon()
   {
      corners = new ArrayList<Point2D.Double>();
      index = 0;
      area = 0;
   }
   
   /**
      Adds a point to the list.
      @param p the point to add
   */
   public void add(Point2D.Double p)
   {
      corners.add(p);   
   }
   
   /**
      Computes the area of a polygon.
      @return area of a polygon
   */
   public double getArea()
   {
	  if(index == corners.size()-2){
		  return area*2;
	  }
	  Point2D a = corners.get(0);
	  Point2D b = corners.get(index+1);
	  Point2D c = corners.get(index+2);
	  area = area + (Math.abs((a.getX()*b.getY()+b.getX()*c.getY()+c.getX()*a.getY()-a.getY()*b.getX()-b.getY()*c.getX()-c.getY()*a.getX()))/2);
	  index+=2;
	  return getArea();
   }
}
