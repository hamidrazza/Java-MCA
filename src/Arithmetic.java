class Arithmetic {
	public static void main(String[] args) {
		// Taking the input from the Command Line Arguments.
		int a, b, c;

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
		System.out.println("Division is : " + c);

	}
}