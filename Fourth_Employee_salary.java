import java.util.Scanner;
public class Fourth_Employee_salary {
	private static Scanner sc;
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			sc = new Scanner(System.in);
			System.out.print("Enter name : ");
			String name= sc.nextLine();
			System.out.print("Hours worked : ");
			int hrs = sc.nextInt();
			System.out.print("Hourly rate: ");
			int rate = sc.nextInt();
			if (hrs>40) {
				System.out.printf("Gross pay for "+ name + " is %d%n" , (hrs-40)*rate/2 + 40*rate );
			}
			else {
				System.out.printf("Gross pay for "+ name + " is %d%n" , hrs*rate );
			}
		}
	}
}
