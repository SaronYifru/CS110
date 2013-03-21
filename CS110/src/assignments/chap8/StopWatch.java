package assignments.chap8;

public class StopWatch {
		java.util.Date date = new java.util.Date();
		
	    private long startTime;
		private long endTime;
		public int getStartTime(int startTime) {
			return startTime;
		}
		public int getEndTime(int endTime) {
			return endTime;
		}
		public StopWatch() {
			startTime = System.currentTimeMillis();
			
		}
		public void start() {
			startTime = System.currentTimeMillis();
		}
		public void stop(){
			endTime = System.currentTimeMillis();
		}
		public long getElapsedTime() {
			return endTime - startTime;
		}
		

}
