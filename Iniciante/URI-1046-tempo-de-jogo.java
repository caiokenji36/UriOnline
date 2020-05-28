
import java.util.Scanner;

public class uri1046 {
	public static void main(String[] args) {
		Scanner novo = new Scanner(System.in);
		int inicio = novo.nextInt();
		int fim = novo.nextInt();
		int restante = 0;
		
		restante = fim - inicio;
		
		if(restante<0) {
			restante = 24 + (fim - inicio);
		}
		if(inicio == fim) {
			System.out.printf("O JOGO DUROU 24 HORA(S)\n");
		}else {
			System.out.printf("O JOGO DUROU %d HORA(S)\n", restante);
		}
	
	}
}
