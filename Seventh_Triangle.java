
public class Seventh_Triangle {

	public static void main(String[] args) {
		int a,b,c =0;
		int j = 2;
		while (c<=500) {
			
			for(int i= 1; i<j; ++i) {
				a=j*i - i*i;
				b=2*i*j;
				c=j*j+i*i;
				
				if (c>500)
					break;
				System.out.format("%4d%4d%4d%n", a, b, c);
			
			}
			j++;
			
		}
		
		

	}

}
