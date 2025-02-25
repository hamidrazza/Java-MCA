import java.util.Scanner;

class Greatest{
	public static void main(String[] args){

		System.out.println("Greatest Among Three");
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first no: ");
		int a = sc.nextInt();
		System.out.print("Enter the first no: ");
		int b = sc.nextInt();
		System.out.print("Enter the first no: ");
		int c = sc.nextInt();
		
		if(a > b && a > c){
			System.out.println(a+" is greatest.");
		}
		else if(b > a && b > c){
			System.out.println(b+" is greatest.");
		}
		else{
			System.out.println(c+" is greatest.");
		}

		// Closing the Scanner class object, so that the space will be free
		sc.close();
	}
}
		