import java.util.Scanner;
public class Fifth_Square {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter length of sides : ");
		int sides = sc.nextInt();
		 if(sides < 0 || sides > 20) {
			 System.out.print("Invalid Length");
			 System.exit(0);
		 }
		 
		 for(int i=0; i<sides;i++) {
			 for(int j = 0;j<sides;j++) {
				 if(i==0 || i==(sides-1) || j==0 || j==(sides-1)) 
					 System.out.print("*");
				 else
					 System.out.print(" ");
			 }
			 System.out.println();
		 }

	}

}
