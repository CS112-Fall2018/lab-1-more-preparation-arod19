import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
	
		
	
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int b;
		float x;
		float y;
		
		
		
		System.out.print("Input the first integer: ");
		a = scanner.nextInt();
		
		System.out.print("Input the second integer: ");
		b = scanner.nextInt();
		
		System.out.print("Input the first decimal: ");
		x = scanner.nextFloat();
		
		System.out.print("Input the second decimal: ");
		y = scanner.nextFloat();
		
		System.out.println("\nAddition:\n");
		System.out.println("first integer + second integer: " + (a+b));
		System.out.println("first integer + first decimal: " + (a+x));
		System.out.println("first integer + second decimal: " + (a+y));
		
		System.out.println("second integer + first decimal: " + (b+x));
		System.out.println("second integer + second decimal: " + (b+y));
		
		System.out.println("first decimal + second decimal: " + (x+y));
		
		System.out.println("\n-------------------------");
		System.out.println("\nDivision:\n");
		
		System.out.println("first integer / second integer: " + (a/b));
		System.out.println("first integer / first decimal: " + (a/x));
		System.out.println("first integer / second decimal: " + (a/y));

		System.out.println("second integer / first decimal: " + (b/x));
		System.out.println("second integer / second decimal: " + (b/y));
		
		System.out.println("first decimal / second decimal: " + (x/y));
		
		
		
		
		System.out.println("second integer / first integer: " + (b/a));
		System.out.println("first decimal / first integer: " + (x/a));
		System.out.println("second decimal / first integer: " + (y/a));
		
		System.out.println("first decimal / second integer: " + (x/b));
		System.out.println("second decimal /  second integer: " + (y/b));
		
		System.out.println("second decimal / first decimal: " + (y/x));
		
	}

}



//Creates 4 local variables
//	Two ints (call them a and b)
//	Two floats (call them x and y)


//Performs the following arithmetic operations on every combination of two of these 
//and output using System.out.println each of the results

//	Addition
//	Division (in both directions)
