import java.util.Scanner;

class OddEven{
	public static void main(String[] args){
		System.out.println("Program to find ODD or EVEN");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no: ");
		int a = sc.nextInt();

		if(a%2 == 0){
			System.out.println(a + " is an EVEN no");
		}else{
			System.out.println(a + " is a ODD no");
		}

		// Closing the Scanner class object to free the space.
		sc.close();
	}
}