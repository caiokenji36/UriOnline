import java.util.Scanner;

public class Uri1040 {
	public static void main(String[] args) {
		
		Scanner novo = new Scanner(System.in);
		
		float N1 = novo.nextFloat();
		float N2 = novo.nextFloat();
		float N3 = novo.nextFloat();
		float N4 = novo.nextFloat();
		float media = ((N1*2) + (N2 *3) +(N3 *4) + N4)/10;
		
		if(media >= 7) {
			System.out.printf("Media: %.1f\nAluno aprovado.\n",media);
		}else if(media<5) {
			System.out.printf("Media: %.1f\nAluno reprovado.\n",media);
		}else if(media>=5 && media<=6.9) {
			float exame = novo.nextFloat();
			N1 = (exame+media)/2;
			if(N1>=5) {
				System.out.printf("Media: %.1f\nAluno em exame.\nNota do exame: %.1f\nAluno aprovado.\nMedia final: %.1f\n",media,exame,N1);
			}else {
				System.out.printf("Media: %.1f\nAluno em exame.\nNota do exame: %.1f\nAluno reprovado.\nMedia final: %.1f\n",media,exame,N1);
			}
			
		}
		
		
	}
}
