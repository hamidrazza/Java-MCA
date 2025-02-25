// MENU for the java programs
import java.util.Scanner;

class Menu{
	public static void main(String[] args){

		// Not completed yet want to add like a menu list.
		Scanner sc = new Scanner(System.in);
		int opt;

		System.out.println("Our Current Java Programs");
		System.out.println("1. Hello World");
		System.out.println("2. Arithmetic Operations");
		System.out.println("3. Greatest among three");
		System.out.println("4. Find Odd or Even");
		System.out.println("0. EXIT");

		System.out.println("Choose an option : ");
		opt = sc.nextInt();

		boolean result = true;
		while(result){
			switch(opt){
				case 1:
			}
			result = false;
		}

		sc.close();
	}
}
