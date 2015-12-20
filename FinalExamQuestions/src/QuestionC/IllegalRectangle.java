package QuestionC;

public class IllegalRectangle extends Exception{
	public IllegalRectangle(int x, int y) {
		super("At least one of" + x + "," + y + "is negative");
	}

	
	
	

}
