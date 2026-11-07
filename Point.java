package Ex2;
import java.util.Scanner;

public class Point {
	private double x, y;

	public Point(double x, double y) { this.x = x; this.y = y;}
	
	public Point(Point other) { this(other.x, other.y); }
	
	public void setX(double x) { this.x = x; }
	
	public void setY(double y) { this.y = y; }
	
	public double getX() { return x; }
	
	public double getY() { return y; }
	
	public String toString() { return " " + x + " " + y; }

	public double getRadius() { return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); }
}