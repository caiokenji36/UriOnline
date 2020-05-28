import java.util.Scanner;

public class Uri1070 {
	public static void main(String[] args) {
		
		Scanner novo = new Scanner(System.in);
		int numero = novo.nextInt();
		int cont = 0;
		
		for(int i=numero;cont<6;i++) {
			
			if(i % 2 !=0) {
				System.out.println(i);
				cont++;
			
			}
		}
		
	}
}
