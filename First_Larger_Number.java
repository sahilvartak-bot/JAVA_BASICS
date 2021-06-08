import java.util.Scanner;

public class First_Larger_Number {
	private static Scanner scanner;

	public static void main(String args[]) 
	{
		int n1, n2;
		System.out.print("Enter the first number: ");
		scanner = new Scanner(System.in);
		n1 = scanner.nextInt();
		System.out.print("Enter the Second number: ");
		n2 = scanner.nextInt();
		
		if (n1==n2) {
			System.out.print("These numbers are equal");
		}
		
		else {
			int larger = (n1 > n2)? n1:n2;
			System.out.printf("%d is larger", larger);
		}
	}
	

}
