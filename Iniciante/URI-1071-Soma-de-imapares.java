import java.util.Scanner;

public class Uri1071 {
	public static void main(String[] args) {
		
		Scanner novo = new Scanner(System.in);
		int numero1 = novo.nextInt();
		int numero2 = novo.nextInt();
		int maior = numero1;
		int menor = numero2;
		if(numero2>maior) {
			maior=numero2;
			menor=numero1;
		}
		int cont = 0;
		
		for(int i=menor+1;i<maior;i++) {
			
			if(i % 2 !=0) {
				
				cont+=i;
			
			}
		}
		System.out.println(cont);
		
	}
}
