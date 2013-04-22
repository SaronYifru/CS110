package assignments.chap11;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {
	
	public boolean isEmpty() {
		return super.isEmpty();
	}
	public int getSize() {
		return size();
	}
	public int  search(Object object) {
		return indexOf(object);
	}
	public Object peek() {
		return super.get(getSize() - 1);
	}
	public Object pop() {
		Object object = super.get(getSize() - 1);
		super.remove(getSize() - 1);
		return object;
	}
	public void push(Object object) {
		super.add(object);
	}
	public String toString() {
		return "stack: " + super.toString();
	}
	
	


}
