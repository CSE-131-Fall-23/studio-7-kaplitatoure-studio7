package studio7;

public class Rectangle {

	private double length;
	private double width;
	
public Rectangle(double length, double width) {
	this.length = length;
	this.width = width;
}

public double getLength() {
	return length;
}

public void setLength(double length) {
	this.length = length;
}

public double getWidth() {
	return width;
}

public void setWidth(double width) {
	this.width = width;
}


public static void main(String [] args) {
	Rectangle r = new Rectangle (4,5);
	Rectangle r2= new Rectangle (3,6);
	System.out.println(r.computePerimeter());
	System.out.println(r2.computePerimeter());
	System.out.println(r.computeArea());
	System.out.println(r2.computeArea());
}
	
public double computeArea() {
	return this.length * this.width;
}
public double computePerimeter() {
	return 2*this.length + 2 * this.width;
}
public boolean isSmaller(Rectangle other) {
	return this.computeArea()< other.computeArea();
}
public boolean isSquare() {
	return this.width == this.length;
}
	
}
	


