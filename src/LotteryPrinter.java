import java.lang.Math;

public class LotteryPrinter {

	public static void main(String[] args) 
	{
		int num1 = (int)(Math.random()*49.0);
		int num2 = (int)(Math.random()*49.0);
		int num3 = (int)(Math.random()*49.0);
		int num4 = (int)(Math.random()*49.0);
		int num5 = (int)(Math.random()*49.0);
		int num6 = (int)(Math.random()*49.0);
		String output = "Play this combination - it'll make you rich! ";
		System.out.println(output);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);


	}
}
