import java.util.Scanner;

public class Uri1067{
	public static void main(String[] args) {
		
		Scanner novo = new Scanner(System.in);
		int numero = novo.nextInt();
		
		for(int i=1;i<=numero;i++) {
			
			if(i % 2 !=0) {
				System.out.println(i);
			}
		}
		
	}
}
