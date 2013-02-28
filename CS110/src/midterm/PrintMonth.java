package midterm;

public class PrintMonth {


	public static void main(String[] args) {
		int startDay1 = 5;
		int daysInMonth1 = 31;
	    printMonth(startDay1, daysInMonth1);
	    System.out.println();
	    int startDay2 = 2;
	    int daysInMonth2 = 28;
	    printMonth(startDay2, daysInMonth2);
	    System.out.println();
	    int startDay3 = 6;
	    int daysInMonth3 = 30;
	    printMonth(startDay3, daysInMonth3);
	    System.out.println();

	}
	public static void printMonth(int startDay, int daysInMonth) {
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		int i = 1;
		for (i = 1; i < startDay; i++) {
			System.out.printf("%4s", " ");
			
		}
		for (i = 1; i <= daysInMonth; i++) {
			System.out.printf("%4d",  i);
			if (((i-1) + startDay) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

}
