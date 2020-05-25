import java.util.Scanner;

public class Uri1042 {
	public static void main(String[] args) {
		
		Scanner novo = new Scanner(System.in);
		
		int n1=novo.nextInt();
		int n2=novo.nextInt();
		int n3=novo.nextInt();
		int nTemporario;
		
		int maior =n1;
		int menor=n3;
		int meio = n2;
		
		if(maior<meio) {
			nTemporario = maior;
			maior = meio;
			meio = nTemporario;
		}
		
		if(meio < menor) {
			nTemporario = meio;
			meio = menor;
			menor = nTemporario;
		}
		
		
		if(maior<meio) {
			nTemporario = maior;
			maior = meio;
			meio = nTemporario;
		}
		
		
		System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n",menor,meio,maior,n1,n2,n3);
		
		
	}
}
