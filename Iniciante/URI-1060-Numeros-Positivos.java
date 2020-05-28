import java.util.Scanner;

public class Uri1060 {
	public static void main(String[] args) {
		
		Scanner novo = new Scanner(System.in);
		int contador=0;
		
		for(int i=0;i<6;i++) {
			double numero = novo.nextDouble();
			if(numero>=0) {
				contador++;
			}
		}
		
		System.out.println(contador+ " valores positivos");
		
		
	}
}
