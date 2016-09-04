
public class HollePrinter {

	public static void main(String[] args) 
	{
		String str = "Hello, World!";
		str = str.replace('o', '1');
		str = str.replace('e','o');
		str = str.replace('1','e');
		System.out.println(str);

	}
}
