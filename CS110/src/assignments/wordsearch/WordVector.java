package assignments.wordsearch;


public class WordVector {

	private int row;
	private int column;
	Direction direction;
	private int length;
	public WordVector(int row, int column, Direction direction, int length) {
		this.row = row;
		this.column = column;
		this.direction = direction;
		this.length = length;
	}
	public int getCol(){
		return column;
		
	}
	public Direction getDirection(){
		return direction;
	}
	public int getLength() {
		return length;
	}
	public int getRow() {
		return row;
	}
	public int getColumn() {
		return column;
	}
	public String tOString() {
		StringBuffer sb = new StringBuffer();
		sb.append("found at [" + String.valueOf(row));
		sb.append(", " + String.valueOf(column + "]"));
		sb.append(" in " + String.valueOf(direction));
		sb.append(" of length " + String.valueOf(length));
		return sb.toString();
	}

}
