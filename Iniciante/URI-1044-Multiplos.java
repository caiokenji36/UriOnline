import java.util.Scanner;

public class Uri1044 {
	public static void main(String[] args) {
		
		Scanner novo = new Scanner(System.in);
		
		int A = novo.nextInt();
		int B = novo.nextInt();
		
		
		
		
		if(A % B ==0 || B % A ==0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao sao Multiplos");
		}
		
		
	}
}
