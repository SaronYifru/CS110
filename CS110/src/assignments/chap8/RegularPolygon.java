package assignments.chap8;

public class RegularPolygon {
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	public RegularPolygon(){
		
	}
	public RegularPolygon(int n, double side) {
		this.side = side;
		this.n = n;
	}
	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	public int getN(int n) {
		return  n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getSide(int side) {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public double getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getPerimeter() {
		return n * side;
	}
	public double getArea() {
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/n));
	}
	
}
