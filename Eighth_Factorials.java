
public class Eighth_Factorials {

	public static void main(String[] args) {
		long factorial=1;
		for(int i=1; i<=20; i++) {
			factorial=factorial*i;
			System.out.printf("%d \t %d%n",i,factorial);
		}

	}
	// range of long is from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	// 100! is out of range of this range thus I am getting no value and console is printing zero.
}
