import java.util.Scanner;

public class Uri1065 {
	public static void main(String[] args) {
		
		Scanner novo = new Scanner(System.in);
		int contador=0;
		 
		
		for(int i=0;i<5;i++) {
			int numero = novo.nextInt();
			if(numero % 2 ==0) {
				
				contador++;
			}
		}
		

		System.out.println(contador+" valores pares");
		
	}
}
