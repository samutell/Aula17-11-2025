//questao 5
import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        int[] A = new int[10];
	        int resto;

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Digite o número " + (i+1) + ": ");
	            A[i] = in.nextInt();
	        }

	        for (int i = 0; i < 10; i++) {
	            System.out.println("Divisores de " + A[i] + ":");
	            for (int j = 1; j <= A[i]; j++) {
	                resto = A[i] % j;
	                if (resto == 0) {
	                    System.out.print(j + " ");
	                }
	                
	            }
	            
	        }
		
	}

}
