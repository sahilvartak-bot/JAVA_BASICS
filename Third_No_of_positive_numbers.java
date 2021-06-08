import java.util.Scanner;

public class Third_No_of_positive_numbers {
	private static Scanner sc;	
	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		int p=0;
		int z=0;
		System.out.print("Enter five numbers: ");
		for(int i=0;i<5;i++) {
			int n = sc.nextInt();
			if (n>0) {
				p++;
			}
			if(n==0) {
				z++;
			}
		}
		System.out.printf("the number of positive numbers are : %d%n", p);
		System.out.printf("the number of zeros are : %d%n", z);
		System.out.printf("the number of negativ numbers are : %d%n", 5-z-p);

	}

}
