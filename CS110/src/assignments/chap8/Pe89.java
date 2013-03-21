package assignments.chap8;

public class Pe89 {
	public static void main(String[] args) {
		RegularPolygon regularPolygon1 = new RegularPolygon();
		System.out.println("The perimeter of the regular polygon1 is "
				+ regularPolygon1.getPerimeter() + " and the area is "
				+ regularPolygon1.getArea());
		RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
		System.out.println("The perimeter of regular polygon2 is " + regularPolygon2.getPerimeter() +
					" and the area is " + regularPolygon2.getArea());
		RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("The perimeter of the regular polygon3 is "
				+ regularPolygon3.getPerimeter() + " and the area is " + regularPolygon3.getArea());
        
	}
}
