import java.util.Scanner;
public class Sixth_palindrome {
	private static Scanner sc;
	static int n;
	public static void main(String[] args) {
		sc =  new Scanner(System.in);
		while (true) {
			System.out.print("Enter a five digit integer : ");
			n = sc.nextInt();
		    if ((n > 99999) || (n < 10000))
		        System.out.println("ERROR Please enter a valid age\n");
		    else
		        break;
		}
		
		int reverse_num = n/10000 + ((n/1000)%10)*10 + ((n/100)%10)*100 + ((n/10)%10)*1000 + 
				(n%10)*10000;
		
		if (reverse_num == n)
			System.out.printf("%d is a palindrome",reverse_num);
		else
			System.out.printf("%d is not a palindrome",n);
		
	}

}
