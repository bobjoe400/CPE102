package lab4;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class PieChart {

	private double width;
	private double height;
	private ArrayList<Double> points;
	
	public PieChart(double width, double height){
		this.width = width;
		this.height = height;
		points = new ArrayList<Double>();
	}
	
	public void add(double value){
		points.add(value);	
	}
	
	public void draw(Graphics2D g){
		//double x2 = 0;
		//double y2 = 0;
		//System.out.println(Math.sin((3*3.14)/2));
		g.drawOval(0, 0, 250, 250);
		double total=0;
		ArrayList<Double> percent = new ArrayList<Double>();
		for(double p: points){
			total+=p;
		}
		for(int i = 0; i < points.size(); i++){
			percent.add((points.get(i)/total)*(2*Math.PI));
		}
		//System.out.println(percent);
		double prev = 0;
		for(double p: percent){
			g.drawLine((int)(250/2), (int)(250/2), (int) (4*(250/2)*Math.cos((p+prev))), (int) (4*(250/2)*Math.sin((p+prev))));
			prev+=p;
		}
	}
}
