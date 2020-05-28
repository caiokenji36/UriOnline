import java.util.Scanner;

public class Uri1064 {
	public static void main(String[] args) {
		
		Scanner novo = new Scanner(System.in);
		int contador=0;
		 double soma=0;
		double array[] = new double[6];
		for(int i=0;i<6;i++) {
			double numero = novo.nextDouble();
			if(numero>=0) {
				array[i]=numero;
				contador++;
			}
		}
		
		for(int i=0;i<6;i++) {
			soma = soma + array[i];
		}
		soma = soma / contador;
		System.out.printf("%d valores positivos\n%.1f\n",contador,soma);
		
		
	}
}
