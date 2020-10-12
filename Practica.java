import java.util.Scanner;
class Practica
{
	public static void main (String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter x");
		int x = in.nextInt();
		System.out.println("Enter y");
		int y = in.nextInt();
		
		System.out.println("Solution :");
		System.out.println((3+ Math.pow(Math.E,y-1)) / 1 + Math.pow(x,2) * Math.abs(y - Math.tan(x)));
		System.out.println("Solution :");
		System.out.println(Math.sin(Math.sqrt(x+1)) - Math.sin(Math.sqrt(x-1)));
		
		System.out.println("Enter length");
		int lRebra = in.nextInt();
		
		System.out.println("Square:");
		System.out.println(6 * Math.pow(lRebra,2));
		
		System.out.println("Enter a");
		int a = in.nextInt();
		System.out.println("Enter b");
		int b = in.nextInt();
		System.out.println("Enter c");
		int c = in.nextInt();

		
		if (a * b == a * c)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		System.out.println("Enter x");
		int x1 = in.nextInt();
		System.out.println("Enter y");
		int y1 = in.nextInt();
		
		
		if (x1 >= 0 && y1 >= (-2 * x1 + 4) && y1 <= (-x1+6) && y1 >= 0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}