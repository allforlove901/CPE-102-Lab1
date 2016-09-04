public class StaircasePrinter {

	public static void main(String[] args) 
	{
		StaircasePrinter staircasePrinter = new StaircasePrinter();
		staircasePrinter.printStairs();
	}

	public void printStairs()
	{
		System.out.println("            +---+");
		System.out.println("            |   |");
		System.out.println("        +---+---+");
		System.out.println("        |   |   |");
		System.out.println("    +---+---+---+");
		System.out.println("    |   |   |   |");
		System.out.println("+---+---+---+---+");
		System.out.println("|   |   |   |   |");
		System.out.println("+---+---+---+---+");
	}
	
}