import java.util.Scanner;

public class Uri1043 {
	public static void main(String[] args) {
		
		Scanner novo = new Scanner(System.in);
		
		double A = novo.nextDouble();
		double B = novo.nextDouble();
		double C = novo.nextDouble();
		double soma = 0;
		
		if(A<B+C && B<A+C && C<B+A) {
			soma = A+B+C;
			System.out.printf("Perimetro = %.1f\n",soma);
		}else {
			soma = ((A+B)/2)*C;
			System.out.printf("Area = %.1f\n",soma);
		}
		
		
	}
}
