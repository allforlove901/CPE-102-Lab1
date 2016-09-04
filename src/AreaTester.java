import java.awt.Rectangle;

public class AreaTester{
	
	public static void main(String[] args) 
	{
		Rectangle rectangle = new Rectangle(10, 10, 20, 50);
		System.out.println(rectangle.getWidth()*rectangle.getHeight());
		System.out.println("Expected: 1000.0");
	}
}

