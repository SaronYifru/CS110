package assignments.chap8;

public class Location {
	public int row;
	public int column;
	public double maxValue;

	public Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}

	public StringBuffer LocationInfo() {
		StringBuffer location = new StringBuffer();
		location.append("The location of the largest element is " + maxValue
				+ " at (" + row + ", " + column + ")");
		return location;
	}

}
