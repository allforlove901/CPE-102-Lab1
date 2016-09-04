
public class FacePrinter {

	public static void main(String[] args) 
	{
		FacePrinter facePrinter = new FacePrinter();
		facePrinter.printFace();
	}

	public void printFace()
	{
		System.out.println("  /////  ");//prints hair
		System.out.println(" | O O | ");//prints eyes
		System.out.println("(|  ^  |)");//prints nose
		System.out.println(" | \\_/ | ");//prints mouth
		System.out.println("  -----  ");//prints chin
	}
	
}
