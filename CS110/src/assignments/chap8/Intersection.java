package assignments.chap8;

public class Intersection {
	private double x1, x2, x3, x4;
	private double y1, y2, y3, y4;
	private double a, b, c, d, x, y;

	public Intersection(double x1, double x2, double x3, double x4, double y1,
			double y2, double y3, double y4) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.y4 = y4;
	}

	public double getA() {
		a = (y2 - y1) / (x2 - x1);
		return a;
	}

	public double getB() {
		b = y1 - (a * x1);
		return b;

	}

	public double getC() {
		c = (y4 - y3) / (x4 - x3);
		return c;
	}

	public double getD() {
		d = y3 - (c * x3);
		return d;
	}

	public StringBuffer findIntersection() {
		StringBuffer intersectionPoint = new StringBuffer();
		LinearEquation equation1 = new LinearEquation(getA(), getB(), getC(),
				getD());
		if (equation1.isSolvable()) {
			x = equation1.getX();
			y = equation1.getY();
			intersectionPoint.append("(" + x + ", " + y + ")");
			return intersectionPoint;
		}
		return null;

	}

	public void printOutIntersection() {
		StringBuffer intersectionPoint = findIntersection();
		if (intersectionPoint == null) {
			System.out.println("The lines do not intersect.");
		} else {
			System.out.println("The intersecting point is: "
					+ intersectionPoint);
		}

	}

}
