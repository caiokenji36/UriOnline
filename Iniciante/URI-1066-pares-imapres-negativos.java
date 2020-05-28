import java.util.Scanner;

public class Uri1066 {
	public static void main(String[] args) {
		
		Scanner novo = new Scanner(System.in);
		int pares=0;
		int impares=0;
		int negativos=0;
		int positivos=0;
		 
		
		for(int i=0;i<5;i++) {
			int numero = novo.nextInt();
			if(numero % 2 ==0) {
				
				pares++;
			}else {
				 impares++;
			}
			if(numero>0) {
				positivos++;
			}else if(numero < 0) {
				negativos++;
			}
		}
		

		System.out.printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n",pares,impares,positivos,negativos);
		
	}
}
