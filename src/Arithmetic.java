import java.util.Scanner;
public class Arithmetic {
	public static void main(String[] args) {
		// Taking the input from the Command Line Arguments.
		/* int a, b, c;

		// Parsing it into integer, so that we can apply the arithmetic operations.
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);

		c = a + b;
		System.out.println("Addition is : " + c);

		c = a - b;
		System.out.println("Subtraction is : " + c);

		c = a * b;
		System.out.println("Multiplication is : " + c);

		c = a / b;
		Sy stem.out.println("Division is : " + c);*/

		/* Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("Enter the first Num : ");
		num1 = sc.nextInt();
		System.out.print("Enter the second Num : ");
		num2 = sc.nextInt(); */

		int num1 = 11, num2 = 6;

		int num3 = num1 + num2;
		System.out.println("The Addition is : " + num3);
		num3 = num1 - num2;
		System.out.println("The Subtraction is : " + num3);
		num3 = num1 * num2;
		System.out.println("The Multiplication is : " + num3);
		num3 = num1 / num2;
		System.out.println("The Division is : " + num3);
		num3 = num1 % num2;
		System.out.println("The Remainder is : " + num3);
	}
}