package assignments.chap8;

public class LinearEquation {

	private double a, b, c, d, x, y;

	public LinearEquation(double a, double b, double c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;

	}

	public double getA(double a) {
		return a;
	}

	public double getB(double b) {
		return b;
	}

	public double getC(double c) {
		return c;
	}

	public double getD(double d) {
		return d;
	}

	public boolean isSolvable() {
		if ((c - a) != 0) {
			return true;
		}
		return false;
	}

	public double getX() {
		x = (b - d) / (c - a);
		return x;

	}

	public double getY() {
		y = (a * x) + b;
		return y;

	}

}
