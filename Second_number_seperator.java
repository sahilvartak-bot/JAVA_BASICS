import java.util.Scanner;

public class Second_number_seperator {

	private static Scanner sc;

	public static void main(String[] args) {
		System.out.print("Enter five digit number : ");
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String number = String.valueOf(n);
		char[] digits1 = number.toCharArray();
		for(int i=0;i<4;i++) {
			System.out.print(digits1[i]+"   ");
					
		}
		System.out.print(digits1[4]);
		//if less than 4 digits are given then array will not be filled giving error
		//if more than 5 digits are given then only first 5 will be given
	}

}
