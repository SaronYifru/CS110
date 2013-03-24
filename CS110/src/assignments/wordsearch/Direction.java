package assignments.wordsearch;

public class Direction {
	private static Direction Easterly;
	private static Direction Northerly;
	private static Direction Southerly;
	private static Direction Westerly;
	Direction direction;
	private int vertical;
	private int horizontal;
	String name;
	public Direction(int vertical, int horizontal) {
		
		this.vertical = vertical;
		this.horizontal = horizontal;
		
	}
	public int getHorizontalStep(){
		return horizontal;
	}
	public int getVerticalStep(){
		return vertical;
	}
	public java.lang.String toString(){
		switch(vertical) {
		case(1):
			direction = Southerly;
		
		case(-1):
			direction = Northerly;
		case(0):
			if (horizontal == 1) {
				direction = Easterly;
			}
			else if(horizontal == -1) {
				direction = Westerly;
			}
		}
		return direction.toString();
		
	}
	

}
